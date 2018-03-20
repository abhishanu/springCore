package com.abhi.spring.springCore.assignments.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/assignments/setterInjection/shopping.xml");
		
		ShoppingCart shoppingCart = (ShoppingCart) applicationContext.getBean("shoppingCart");
		
		Item item = shoppingCart.getItem();
		
		System.out.println(item);
	}
}
