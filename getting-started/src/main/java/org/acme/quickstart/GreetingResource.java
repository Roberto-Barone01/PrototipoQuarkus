package org.acme.quickstart;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/math")
public class GreetingResource {

	
//    @Inject
//    GreetingService service;
//    
//    @Inject
//    SumService service2;
//    
    @Inject
	RandomInt services3;

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    @Path("/greeting/{name}")
//    public String greeting(@PathParam String name) {
//        return service.greeting(name);
//    }
//    
//    @GET
//    @Path("/calculator/{a}/{b}")
//    public String add(@PathParam int a, @PathParam int b) {
//    	
//    	return "<h1>"+service2.add(a, b)+"</h1>";
//    }
//
//	
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "hello ciao";
//    }
    
	
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/random")
	public int getRandomInt() {
		return services3.getRandomInt();
	}
    
 
    
}