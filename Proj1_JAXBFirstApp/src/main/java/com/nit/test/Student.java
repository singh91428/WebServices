package com.nit.test;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * @author cpsingh
 *
 */
@Data
@XmlRootElement
public class Student {
	private int sid;
	private String sname;
	private double fee;
	private List<String> color;
	
}
