package in.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/login")
public class LoginRestController {
	@POST
	@Path("/prm")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String readAsParam(@FormParam("user")String user,
			@FormParam("pass")String pass) {
		return "Param \n User: "+user+" \n Password: "+pass;
	}
	@POST
	@Path("/obj")
	public String readAsObj(Form fobj) {
		MultivaluedMap<String,String> m=fobj.asMap();
		return "Data is: "+m;
	}
	@POST
	@Path("/map")
	public String readAsMap(MultivaluedMap<String,String> m) {
		return "Data is: "+m;
	}
}
