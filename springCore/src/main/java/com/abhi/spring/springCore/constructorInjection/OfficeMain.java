package com.abhi.spring.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OfficeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/constructorInjection/employeeConfig.xml");
		
		Employee emp = (Employee) applicationContext.getBean("emp");
		
		System.out.println("Employee Details:\n" + emp);
	}
}
