
package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/sec")
public class SecureRestController {
	@GET
	public Response validuser(@HeaderParam("id")String cid,
			@HeaderParam("secret")String sec) {
		Response res=null;
		if(cid==null && sec==null) {
			//return " no security details found";
			res=Response.status(400).entity("No data found").build();
		}
		else if("cps".equals(cid)&&"singh".equals(sec)) {
			//return "Wecome to Header Section";
			res=Response.status(200).entity("Success").build();
		}
		else
			res=Response.status(Status.UNAUTHORIZED).entity("wrong user and pass").build();
		return res;
	}
}
