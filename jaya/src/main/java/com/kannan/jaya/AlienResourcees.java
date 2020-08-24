package com.kannan.jaya;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("aliens")
public class AlienResourcees 
{
	
	
	AlienRepository repo=new AlienRepository();
 @GET
 public List<Alien> getAlien()
 {
	
	return repo.getAliens();
	 
 }
}
	