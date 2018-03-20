package com.abhi.spring.springCore.assignments.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/assignments/dependency/dependencyConfig.xml");
		University university = (University) applicationContext.getBean("university");
		University university2 = (University) applicationContext.getBean("university");
		
		university.setLocation("Kanpur");
		university.setName("CSJM");
		university.setId(101);
		
		System.out.println("University1 details:"+university);
		
		System.out.println("University2 details:"+university2);
	}
}
