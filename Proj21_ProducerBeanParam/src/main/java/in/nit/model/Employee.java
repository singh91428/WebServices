package in.nit.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

import lombok.Data;
@Data
public class Employee {
	@DefaultValue("5")
	@QueryParam("eid")
	private Integer id;
	@DefaultValue("cpsingh")
	@HeaderParam("ename")
	private String ename;
	@DefaultValue("8.5")
	@FormParam("esal")
	private Double sal;
}
