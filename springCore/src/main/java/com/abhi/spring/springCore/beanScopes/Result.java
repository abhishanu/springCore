package com.abhi.spring.springCore.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/beanScopes/beanScopeConfigSingleton.xml");
		
		ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/beanScopes/beanScopeConfigPrototype.xml");
		
		Student student1 = (Student) applicationContext.getBean("student");
		Student student2 = (Student) applicationContext.getBean("student");
		
		System.out.println("Comparison:"+(student1.hashCode() == student2.hashCode()));
		
		Student student3 = (Student) applicationContext2.getBean("student");
		Student student4 = (Student) applicationContext2.getBean("student");
		
		System.out.println("Comparison:"+(student3.hashCode() == student4.hashCode()));
		
	}

}
