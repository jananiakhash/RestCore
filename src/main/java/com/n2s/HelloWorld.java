package com.n2s;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorld {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String textHello() {
		System.out.println("inside text method");
		return "Hello";

	}
	@GET
	@Produces(MediaType.TEXT_XML)
	public String xmlHello() {
		System.out.println("inside xml method");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello friend" + "</hello>";

	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String htmlHello() {
		System.out.println("inside html method");
		return "<html> " + "<title>" + "Hello" + "</title>" + "<body><h1>" + "Hello" + "</body></h1>" + "</html> ";
	}

}
