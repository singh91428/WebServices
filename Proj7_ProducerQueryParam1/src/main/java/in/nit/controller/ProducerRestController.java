package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/prod")
public class ProducerRestController {
	@GET
	public String getInfo(@QueryParam("code") String pcode) {
		return "producer code is "+pcode;
	}
	//http://localhost:1112/Proj7_ProducerQueryParam1/rest/prod?code=ONE
}
