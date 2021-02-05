package com.nt.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	private int sno;
	private String sname;
	@XmlElementWrapper(name="subjects")
	private List<String> subj;
}
