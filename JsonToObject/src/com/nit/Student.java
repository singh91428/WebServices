package com.nit;

import java.util.Map;

import lombok.Data;
@Data
public class Student {
	private int sid;
	private String sname;
	private Map<String,Integer> marks;
}
