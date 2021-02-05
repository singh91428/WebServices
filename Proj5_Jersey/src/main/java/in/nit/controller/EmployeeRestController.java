package in.nit.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeRestController {
	@GET
	public String fetch() {
		return "emp details";
	}
	@POST
	public String insert() {
		return "insert emp data";
	}
	@PUT
	public String modify() {
		return "modify data";
	}
	@DELETE
	public String delete() {
		return "delete data";
	}
}
