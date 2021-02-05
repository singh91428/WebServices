package in.nit.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import in.nit.model.Employee;

@Path("/test")
public class MyResource {
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getIt(@BeanParam Employee e) {
        return e.toString();
    }
}
