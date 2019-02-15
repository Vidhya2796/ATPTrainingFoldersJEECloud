package com.vidhyac.helloworld.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class ShowHello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showHello() {
		return "Hello World!!";
	}
}
