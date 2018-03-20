package com.abhi.springCore.collectionIntegration.mapCollection;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collectionConfig.xml");
		
		Customer customer = (Customer) applicationContext.getBean("customer");
		
		System.out.println("Customer Id:"+customer);
		
		System.out.println("********Products********");
		
		System.out.println("Product:"+customer.getProducts().get(10));
		
		System.out.println("Class Name :"+customer.getProducts().getClass().getName());
	
	}

}
