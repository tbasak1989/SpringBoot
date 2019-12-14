#@AutoConfiguration - looks for all the classes/library available in its class path and initializes spring bean for it. For example, jacksonMessageConverter, default error page(white level error page) etc
#DispatcherServlet - is the front-controller. Every request comes to this front-controller first. Then depending on the request method and path it decides the appropriate controller-method for it and forward the control to the method
#Once the method process the request and try to send a bean back, @ResponseBody inside @RestController comes into action. It hands it over to the appropriate message converter(E.g- jacksonMessageConverter) to parse the bean to a JSON response and sent it over to client.

implementing CI/CD pipeline.....
