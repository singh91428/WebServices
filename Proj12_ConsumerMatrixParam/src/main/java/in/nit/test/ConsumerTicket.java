package in.nit.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ConsumerTicket {
	private static String uri="http://localhost:1112/Proj11_ProducerMatrixParam";
	private static String path="/rest/ticket";
	public static void main(String[] args) {
	Response res=ClientBuilder.newClient().target(uri).path(path)
			.matrixParam("tktid",1).matrixParam("pname","chandu")
			.matrixParam("from","chennai").matrixParam("to","dto")
			.matrixParam("bfare",700.0).matrixParam("sfare",150.0)
			.request().get();
	System.out.println(res.getStatus());
	System.out.println(res.getStatusInfo());
	System.out.println(res.readEntity(String.class));
	}

}
