package com.abhi.spring.springCore.collectonIntegration.listCollection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collectionConfig.xml");
		
		Hospital hospital = (Hospital) applicationContext.getBean("hospital");
		
		System.out.println("In main...........");
		
		System.out.println("Hospital Name:"+hospital.getName());
		
		Iterable<String> departments=hospital.getDepartments();
		
		for (String department : departments) {
			System.out.println("Departments:"+department);
		}
		
		Iterable<List<String>> doctors=hospital.getDoctors();
		
		for (List<String> doctor : doctors) {
			for (String docPost : doctor) {
				System.out.println("Doctor post:"+docPost);
			}
		}

	}

}
