package com.abhi.spring.springCore.collectonIntegration.setCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collectionConfig.xml");
		
		CarDealer cars = (CarDealer) applicationContext.getBean("car");
		
		System.out.println("Name:"+cars.getName());
		System.out.println("*******Models registered*******");
		
		Iterable<String> carModels=cars.getModels();
		
		for (String carModel : carModels) {
			System.out.println("Model name:"+carModel);
		}
		
		System.out.println();
		
		System.out.println("Class Of List:"+carModels.getClass().getName());
	}

}
