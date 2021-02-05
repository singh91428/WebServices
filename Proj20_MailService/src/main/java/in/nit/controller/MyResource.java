package in.nit.controller;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/mail")
public class MyResource {

    @POST
    public Response getIt(@FormParam("to")String to,
    		@FormParam("sub")String sub,
    		@FormParam("msg")String text
    		) {
    	Response res=null;
    	if(to.isBlank() || sub.isBlank()||text.isBlank())
    		res=Response.status(400).build();
    	else {
    	try {
			
    		Properties props=new Properties();
    		props.put("mail.smtp.host", "smtp.gmail.com");
    		props.put("mail.smtp.port", 465);
    		props.put("mail.smtp.auth", true);
    		props.put("mail.smtp.starttls.enable", true);
    		
    		final String user="cpskinchan3012@gmail.com";
    		final String pwd="chandrakr";
    		
    		Session ses=Session.getInstance(props, new Authenticator() {
    			protected PasswordAuthentication getPasswordAuthentication() {
    			return new PasswordAuthentication(user,pwd);
    			}
    			});
    			//4. Create MimeMessage
    			MimeMessage m=new MimeMessage(ses);
    			m.setRecipient(RecipientType.TO, new InternetAddress(to));
    			m.setSubject(sub);
    			m.setText(text);
    			m.setFrom(user);
    			//5. Send Message
    			Transport.send(m);
    			res=Response.status(200).build();
    			System.out.println("done");
    			
		} catch (Exception e) {
			res=Response.status(500).build();
		}
    	}
		return res;
    }
}
