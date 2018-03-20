package com.abhi.java8.stream.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample2 {

	public static void main(String[] args) {
		List<Employee> staff = Arrays.asList(
				new Employee("Abhi", 123, new BigDecimal(10000)),
				new Employee("Abhishek", 123, new BigDecimal(20000))
        );
		
		List<String> names = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		Long collect = staff.stream().map(x -> x.getName()).collect(Collectors.counting());
		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
		}

		System.out.println("Collect:" + collect);
				
	}

}
