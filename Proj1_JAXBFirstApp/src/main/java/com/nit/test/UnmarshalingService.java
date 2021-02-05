package com.nit.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshalingService {
	public static void toObject() {
		try {
			JAXBContext con=JAXBContext.newInstance(Student.class);
			Unmarshaller um=con.createUnmarshaller();
			Object ob=um.unmarshal(new File("D:/WebServices/studentdetails.xml"));
			if(ob instanceof Student) {
				Student s=(Student) ob;
				System.out.println(s);
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
