package in.nit.controller;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/ticket")
public class TicketRestController {
	@GET
	public String getFinalTicket(@MatrixParam("tktid") int id,
			@MatrixParam("pname") String name,
			@MatrixParam("from") String from,
			@MatrixParam("to") String to,
			@MatrixParam("bfare") double bfare,
			@MatrixParam("sfare") double sfare) {
		if(id!=0 && name!=null && from!=null && to!=null && bfare!=0.0 && sfare!=0.0) {
		double tfare=bfare+sfare;
		id=id+(new Random().nextInt(30));
		StringBuilder msg=new StringBuilder().append("Details are \n")
				.append(" Ticket id: ").append(id+"\n")
				.append(" Passenger Name: ").append(name+"\n")
				.append(" From: ").append(from+"\n")
				.append(" To: ").append(to+"\n")
				.append(" Base Fare: ").append(bfare+"\n")
				.append(" Service Fare: ").append(sfare+"\n")
				.append(" Total Fare: ").append(tfare+"\n");
		return msg.toString();
		}
		else
			return "provide all values";
	}
}
