package com.nit;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class CollectionTest {
	public static void main(String[] args) {
		JSONWithCollection obj=new JSONWithCollection();
		obj.setPid(1);
		obj.setPname("chandu");
		obj.setModels(List.of("R","G","B"));
		obj.setInfo(Map.of("R",1,"G",7,"B",4));
		obj.setPass("hghghgh");
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(obj);
			System.out.println(json);
			om.writeValue(new File("D:/WebServices/person.json"),obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
