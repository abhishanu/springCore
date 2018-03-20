package com.abhi.reflection.privateMehods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException,
			NoSuchFieldException {
		Class<?> cla = Class.forName("com.abhi.reflection.privateMehods.TestClass");

		// Access Constructors
		Constructor<TestClass>[] declaredConstructors = (Constructor<TestClass>[]) cla.getDeclaredConstructors();

		TestClass newInstance = null;

		for (Constructor<TestClass> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			newInstance = constructor.newInstance();
			break;
		}

		System.out.println("Instances::" + newInstance);

		System.out.println("Class Name::" + cla);

		Method method = cla.getDeclaredMethod("sayHello");

		method.setAccessible(true);

		method.invoke(cla.newInstance());

		// Access private fields.......
		Field field = cla.getDeclaredField("name");

		field.setAccessible(true);

		String value = (String) field.get(cla.newInstance());

		System.out.println("Name::" + value);

	}

}
