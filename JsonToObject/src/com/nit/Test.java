package com.nit;

import java.io.File;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		Student s=new Student();
		s.setMarks(Map.of("Hindi",68,"Englih",87,"Math",77));
		s.setSid(1);
		s.setSname("chandu");
		try {
			//Create objectmapper object
			ObjectMapper om=new ObjectMapper();
			//Object to json
			String json=om.writeValueAsString(s);
			System.out.println(json);
			//json to object
			s=om.readValue(json,Student.class);
			System.out.println(s);
			//write json file value 
			om.writeValue(new File("D:/WebServices/student.json"), s);
			//read json file 
			s=om.readValue(new File("D:/WebServices/student.json"), Student.class);
			System.out.println(s);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
