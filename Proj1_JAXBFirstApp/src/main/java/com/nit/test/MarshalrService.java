package com.nit.test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class MarshalrService {
	public static void toXml() {
		Student s=new Student();
		s.setSid(1);
		s.setFee(43.7);
		s.setSname("chandu");
		s.setColor(List.of("R","G","B"));
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Student.class);
			Marshaller m=context.createMarshaller();
			m.marshal(s, new File("D:/WebServices/studentdetails.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
