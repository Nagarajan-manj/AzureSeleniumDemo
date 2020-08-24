package com.kannan.jaya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/*import javax.ws.rs.core.MediaType;*/

@Path("Helloos")
public class KaniResource {
	
	
@GET
/*@Produces(MediaType.TEXT_PLAIN)
*/
@Produces("text/html")

public String getIt()
{
	return "Got it";
}

	
}
