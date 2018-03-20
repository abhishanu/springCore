package com.abhi.spring.springCore.refType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/refType/refConfig.xml");
		
		Student student = (Student) applicationContext.getBean("Student");
		Student student2 = (Student) applicationContext.getBean("Student2");
		System.out.println("Name Of Student:"+student.getName());
		System.out.println("Marks:"+student.getMarks());
		
		System.out.println("Percentage:"+student.nettPercentage());
		
		System.out.println();
		System.out.println("**************************");
		System.out.println("Name Of Student:"+student2.getName());
		System.out.println("Marks:"+student2.getMarks());
		
		System.out.println("Percentage:"+student2.nettPercentage());
	}

}
