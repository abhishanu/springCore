package com.abhi.reflection.privateMehods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TestClass c = TestClass.getInstance();
		TestClass c = new TestClass();

		Method method = TestClass.class.getDeclaredMethod("sayHello");

		method.setAccessible(true);

		method.invoke(c);
	}
}
