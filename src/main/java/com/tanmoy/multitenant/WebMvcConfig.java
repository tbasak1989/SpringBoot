package com.tanmoy.multitenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tanmoy.interceptor.TenantInterceptor;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Autowired
  TenantInterceptor tenantInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(tenantInterceptor);
  }


}
