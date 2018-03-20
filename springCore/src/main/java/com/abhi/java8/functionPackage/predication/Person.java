package com.abhi.java8.functionPackage.predication;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Person [age=%s, name=%s]", age, name);
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}
