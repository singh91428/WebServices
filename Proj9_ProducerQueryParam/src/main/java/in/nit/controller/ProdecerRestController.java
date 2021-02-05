package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/prod")
public class ProdecerRestController {
	@GET
	public String getDetails(@QueryParam("pid") int id,
			@QueryParam("pcode") String code,
			@QueryParam("pname") String name) {
		return new StringBuffer().append("Data is \n:")
				.append(" ID: ").append(id)
				.append(" CODE: ").append(code)
				.append(" NAME: ").append(name).toString();
	}
}
