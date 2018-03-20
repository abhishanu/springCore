package com.abhi.spring.springCore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OverloadingProblemMain {
	public OverloadingProblemMain(int a, int b) {
		System.out.println("Inside Constructor");
		System.out.println("Arg 0:" + a);
		System.out.println("Arg 1:" + b);
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/abhi/spring/springCore/constructorInjection/employeeConfig.xml");

		OverloadingProblemMain overloadingProblemMain = (OverloadingProblemMain) applicationContext.getBean("test");
	}
}
