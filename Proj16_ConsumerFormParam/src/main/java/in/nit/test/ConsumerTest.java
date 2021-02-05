package in.nit.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConsumerTest {
	private static String uri="http://localhost:1112/Proj15_ProducerFormParam/";
	private static String path="/rest/data";
	public static void main(String[] args) {
		Form f=new Form();
		f.param("id","4").param("name","4").param("sal","4");
		Future<String> res=ClientBuilder.newClient().target(uri).path(path)
				 .request(MediaType.APPLICATION_FORM_URLENCODED)
		           .accept(MediaType.TEXT_PLAIN)
		           .buildPost(Entity.form(f)).submit(String.class);
		 try {
			System.out.println(res.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
