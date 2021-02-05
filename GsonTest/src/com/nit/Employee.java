package com.nit;

import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class Employee {
	private int eid;
	private String ename;
	private Set<String> subjects;
	private Map<String,Integer> marks;
}
