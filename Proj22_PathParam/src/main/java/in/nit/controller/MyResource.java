package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class MyResource {

    @GET
    @Path("/show/{eid}")
    public String getIt(@PathParam("eid")int eid) {
        return "Id is "+eid;
    }
    @GET
    @Path("/show/{eid}/{ename}")
    public String getIt1(@PathParam("eid")int eid,
    		@PathParam("ename")String name) {
        return "Id is "+eid+" "+name;
    }
}
