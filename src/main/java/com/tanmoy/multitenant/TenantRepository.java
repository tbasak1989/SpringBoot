package com.tanmoy.multitenant;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends PagingAndSortingRepository<Tenant,String>{

}
