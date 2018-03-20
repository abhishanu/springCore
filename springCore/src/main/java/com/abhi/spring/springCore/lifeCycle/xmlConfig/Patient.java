package com.abhi.spring.springCore.lifeCycle.xmlConfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting up Id");
		this.id = id;
	}
	
	public void start(){
		System.out.println("Init-method");
	}
	
	public void destroy(){
		System.out.println("Destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
