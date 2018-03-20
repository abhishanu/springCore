package com.abhi.spring.springCore.lifeCycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting up Id");
		this.id = id;
	}
	
	@PostConstruct
	public void start(){
		System.out.println("Init-method");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("Destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	
	
}
