package com.nit;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Testing {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("chandu");
		e.setSubjects(Set.of("Math","Eng","Hindi"));
		e.setMarks(Map.of("Math",76,"Eng",87,"Hindi",90));
		try (FileWriter f=new FileWriter("D:/WebServices/employee.json")){
			Gson g=new GsonBuilder().setPrettyPrinting().serializeNulls().create();
			//convert object to json
			String json=g.toJson(e);
			System.out.print(json);
			//convert object to json and write on file
			g.toJson(e,f);
			//convert json to object
			e=g.fromJson(json,Employee.class);
			System.out.println();
			System.out.println(e);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
}
