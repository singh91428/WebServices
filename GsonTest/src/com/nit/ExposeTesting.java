package com.nit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExposeTesting {
	public static void main(String[] args) {
		Employee_Expose ee=new Employee_Expose();
		ee.setSid(1);
		ee.setAdd("Bangolre");
		ee.setFee(544.4);
		ee.setPass("hghghg");
		ee.setSname("chandu");
		Gson g=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String json=g.toJson(ee);
		System.out.println(json);
	}
}
