 package in.nit.controller;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import in.nit.model.Contract;

@Path("/cnt")
public class ContractRestController {
	@Path("/ct")
	@GET
	@Produces("application/json")
	public Contract showContract() {
		/*
		 * return new Contract(10,"NIT",3.33, List.of("M1","M2","M3"),
		 * Map.of("s1","ABC","s2","XYZ"));
		 */
		Contract c=new Contract();
		c.setCid(1);
		c.setCode("NIT");
		c.setNilAmt(4.7);
		c.setMstones(List.of("M1","M2","M3"));
		c.setService(Map.of("s1","ABC","s2","XYZ"));
		return c;
	}
	
}
