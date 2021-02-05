package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/student")
public class StudentRestController {
	@GET
	public String getExamResult(@MatrixParam("sid") int id,
			@MatrixParam("sname") String sname,
	@MatrixParam("hm") int hm,
	@MatrixParam("mm") int mm,
	@MatrixParam("em") int em){
		StringBuilder msg=new StringBuilder().append("Student marks details is \n")
				.append("Hindi : ").append(hm+"\n")
		.append("English : ").append(em+"\n")
		.append("Math : ").append(mm+"\n");
		if(hm>35 && em>35 && mm>35) {
			int total=hm+mm+em;
			double avg=total/3;
			if(avg>=75.0)
				return msg.append("With grade A+").toString();
			if(avg<75.0 && avg>=60)
				return msg.append("With grade A").toString();
			if(avg<60.0 && avg>=45.0)
				return msg.append("With grade B").toString();
			else
				return msg.append("With grade C").toString();
		}
		else
			return msg.append("Student Failed").toString();
	}
}
