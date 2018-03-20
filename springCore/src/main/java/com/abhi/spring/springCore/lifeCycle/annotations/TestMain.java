package com.abhi.spring.springCore.lifeCycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/lifeCycle/annotations/patientConfig.xml");
		
		Patient patient = (Patient) applicationContext.getBean("patient");
		
		System.out.println(patient);
		//to call destruction method
		applicationContext.registerShutdownHook();
		
	}
}
