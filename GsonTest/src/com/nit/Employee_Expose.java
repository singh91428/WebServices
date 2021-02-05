package com.nit;

import com.google.gson.annotations.Expose;

import lombok.Data;

@Data
public class Employee_Expose {
	@Expose//(serialize = false)
	private int sid;
	@Expose//(serialize = false)
	private String sname;
	@Expose//(serialize = false)
	private Double fee;
	@Expose//(serialize = false)
	private String add;
	@Expose(serialize = false)
	private String pass;
}
