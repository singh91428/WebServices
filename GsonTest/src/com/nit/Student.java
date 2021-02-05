package com.nit;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String sname;
	private double sfee;
	private transient String pass;
}
