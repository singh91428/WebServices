package com.nt.opration;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.nt.model.Student;

public class MarshallingService {
	public static void toXml() {
		Student s=new Student();
		s.setSno(1);
		s.setSname("chandu");
		s.setSubj(List.of("Eng","Hindi","Math"));
		try {
			JAXBContext c=JAXBContext.newInstance(Student.class);
			Marshaller m=c.createMarshaller();
			m.marshal(s,new File("D:/WebServices/studentListWrapper.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
