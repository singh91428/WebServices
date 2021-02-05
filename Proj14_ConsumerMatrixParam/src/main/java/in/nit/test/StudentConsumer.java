package in.nit.test;

import java.util.Scanner;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class StudentConsumer {
	private static String uri="http://localhost:1112/Proj13_ProducerMatrixParam";
	private static String path="/rest/student";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hindi marks");
		int hm=sc.nextInt();
		System.out.println("Enter Math marks");
		int mm=sc.nextInt();
		System.out.println("Enter English marks");
		int em=sc.nextInt();
		Response res=ClientBuilder.newClient().target(uri).path(path)
				.matrixParam("hm",hm).matrixParam("mm",mm).matrixParam("em",em)
				.request().get();
		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		System.out.println(res.readEntity(String.class));
	}

}
