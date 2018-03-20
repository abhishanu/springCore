package com.abhi.spring.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveTypeMain {

	public static void main(String[] args) {
		System.out.println("In main");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfig.xml");
		
		Employee emp = (Employee) applicationContext.getBean("emp");
		System.out.println("Bean:"+emp);
		
		System.out.println("Id:"+emp.getId());
		System.out.println("Name:"+emp.getName());
		System.out.println("********Second Employee********");
		Employee emp1 = (Employee) applicationContext.getBean("emp1");
		System.out.println("Id:"+emp1.getId());
		System.out.println("Name:"+emp1.getName());
		
		System.out.println("********Third Employee********");
		Employee emp2 = (Employee) applicationContext.getBean("emp2");
		System.out.println("Id:"+emp2.getId());
		System.out.println("Name:"+emp2.getName());

	}

}
