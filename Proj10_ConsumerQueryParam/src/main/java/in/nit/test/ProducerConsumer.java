package in.nit.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ProducerConsumer {
	private static String uri="http://localhost:1112/Proj9_ProducerQueryParam/";
	private static String path="/rest/prod";
	public static void main(String[] args) {
		try {
			Response res=ClientBuilder.newClient().target(uri)
					.path(path).queryParam("pid",1)
					.queryParam("pcode","cpps")
					.queryParam("pname","chandu")
					.request().get();
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
