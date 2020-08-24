package com.kannan.jaya;


	
	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.Response;
	
	
	public class HelloTest {

	@Path("customers")
	public class HelloWeb {


	  @GET
	  @Path("nri")
	  @Produces("Media")
	  public Response getNriCust() {

	            String output = "I am from 'getNriCust' method";
	            return Response.status(200).entity(output).build();
	  }
	}

}
