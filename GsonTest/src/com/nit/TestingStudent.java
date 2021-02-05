package com.nit;

import com.google.gson.Gson;

public class TestingStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(1);
		s.setPass("fgdfgfdg");
		s.setSname("chandu");
		s.setSfee(545.3);
		try {
			System.out.println(s);
			Gson g=new Gson();
			//object to json
			String josn=g.toJson(s);
			System.out.println(josn);
			//json to obj
			s=g.fromJson(josn,Student.class);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
