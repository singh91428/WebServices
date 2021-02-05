package com.nit;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(1);
		s.setSadd("HYD");
		s.setSname("chandu");
		ObjectMapper om=new ObjectMapper();
		try {
			String json=om.writeValueAsString(s);
			System.out.println(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
