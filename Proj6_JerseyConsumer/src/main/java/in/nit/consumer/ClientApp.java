package in.nit.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientApp {
	private static String uri="http://localhost:1112/Proj5_Jersey/";
	private static String path="/rest/emp";
	public static void main(String[] args) {
		/*
		 * Client c=ClientBuilder.newClient(); WebTarget wt=c.target(uri).path(path);
		 * Invocation.Builder builder=wt.request(); Response res=builder.get();
		 */
		Response res=ClientBuilder.newClient().target(uri).path(path).request().get();
		System.out.println(res.getStatus());
		//System.out.println(res.getStatusInfo());
		System.out.println(res.readEntity(String.class ));
		
		
	}
}
