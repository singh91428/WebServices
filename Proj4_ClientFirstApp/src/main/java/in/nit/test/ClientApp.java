package in.nit.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientApp {
	private static String uri="http://localhost:1112/Proj3_JerseyFirstApp/";
	private static String path="/rest/std";
	public static void main(String[] args) {
		Client c=ClientBuilder.newClient();
		WebTarget target=c.target(uri).path(path);
		Invocation.Builder builer=target.request();
		Response res=builer.get();
		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		System.out.println();
		System.out.println(res.readEntity(String.class));
	}
	
}
