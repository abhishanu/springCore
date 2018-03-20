package com.abhi.reflection.privateMehods;

public class TestClass {
	private String name = "Abhi";

	// private static TestClass testClass;

	private void sayHello() {
		System.out.println("Its a private method...");
	}

	/*
	 * private TestClass() {
	 * 
	 * }
	 */

	/*
	 * public static TestClass getInstance() { if (testClass == null) {
	 * testClass = new TestClass(); }
	 * 
	 * return testClass; }
	 * 
	 * @Override public String toString() { return
	 * String.format("TestClass [name=%s]", name); }
	 */
}
