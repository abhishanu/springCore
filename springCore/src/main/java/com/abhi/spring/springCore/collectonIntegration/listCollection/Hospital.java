package com.abhi.spring.springCore.collectonIntegration.listCollection;

import java.util.List;

public class Hospital {
	private String name;
	private List<String> departments;
	private List<List<String>> doctors;
	
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<List<String>> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<List<String>> doctors) {
		this.doctors = doctors;
	}
}
