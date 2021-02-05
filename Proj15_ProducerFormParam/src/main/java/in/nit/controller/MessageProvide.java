package in.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/data")
public class MessageProvide {
	@POST
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	//@Produces(MediaType.TEXT_PLAIN)
	public String postData(@FormParam("id")int id,
			@FormParam("name")String name,
			@FormParam("sal")double sal){
		return "Id: "+id+" Name: "+name+" sal: "+sal;
	}
}
