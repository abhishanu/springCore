package com.abhi.spring.springCore.dependencyCheck.requiredExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/dependencyCheck/requiredExample/config.xml");
		Prescription prescription = (Prescription) applicationContext.getBean("prescription");
		
		System.out.println("Details:"+prescription);

	}

}
