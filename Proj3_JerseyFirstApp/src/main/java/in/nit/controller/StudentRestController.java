package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/std")
public class StudentRestController {
	@GET
	public String saveStudent() {
		return "Student save";
	}
}
