package in.nit.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ConsumerTest {
	private static String uri="http://localhost:1112/Proj17_ProducerHeadParam";
	private static String path="/rest/sec";
	public static void main(String[] args) {
		try {
			Response res=ClientBuilder.newClient().target(uri).path(path)
					.request().header("id","cps1").header("secret","singh1")
					.get();
			System.out.println(res.getStatus());
			System.out.println(res.getStatusInfo());
			System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
