package com.abhi.java8.functionPackage.predication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClassExample {

	public static void main(String[] args) {
		Predicate<Person> isAnAdult = person -> person.getAge() >= 18;
		
		List<Person> totalPersons = Arrays.asList(new Person(14, "ABC"), new Person(18, "XYZ"), new Person(19, "PQR"));

		Long noOfAdults = totalPersons.stream().filter(isAnAdult).count();
		
		List<String> adultPersonsNames = totalPersons.stream().filter(isAnAdult).map(person -> person.getName())
				.collect(Collectors.toList());

		System.out.println("Total Adults in list:" + noOfAdults);
		
		System.out.println("Adults Names:" + adultPersonsNames);
	}

}
