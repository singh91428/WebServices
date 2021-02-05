package in.nit.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ProducerConsumer {
	private static String uri="http://localhost:1112/Proj7_ProducerQueryParam1/";
	private static String path="/rest/prod";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Response res=ClientBuilder.newClient().target(uri).path(path)
					.queryParam("code","ONE").request().get();
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
