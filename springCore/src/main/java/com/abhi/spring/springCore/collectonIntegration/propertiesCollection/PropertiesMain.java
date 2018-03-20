package com.abhi.spring.springCore.collectonIntegration.propertiesCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/abhi/spring/springCore/collectonIntegration/propertiesCollection/propertiesConfig.xml");
		
		CountriesAndLauguages countryAndLang = (CountriesAndLauguages) applicationContext.getBean("countryAndLang");
		
		System.out.println(countryAndLang);
		
	}
}
