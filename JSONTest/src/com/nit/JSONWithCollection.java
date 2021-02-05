package com.nit;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

import lombok.Data;
@Data
public class JSONWithCollection {
	private int pid;
	private String pname;
	private List<String> models;
	private Map<String,Integer> info;
	//ignore property
	@JsonIgnore
	private String pass;
}
