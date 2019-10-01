package com.zensar.webservice.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	//This method is called ifHTML and XML is not requested.
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		return "Welcome to Zensar HelloService";		
	}
	
	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<h1>Welcome to Zensar HTML</h1>";		
	}
	
	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return "<?xml version='1.0'?><hello>Hello Jersey</hello>";
	}
}
