package com.abhi.spring.springCore.lifeCycle.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
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
	
	public void end(){
		System.out.println("Destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}
	
	
}
