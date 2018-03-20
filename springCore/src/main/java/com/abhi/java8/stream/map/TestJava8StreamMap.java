package com.abhi.java8.stream.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestJava8StreamMap {

	public static void main(String[] args) {
		List<String> listSmall = Arrays.asList("a", "e", "i", "o", "u");
		
		List<String> listUpper = listSmall.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("List Upper:" + listUpper + "\n\n");

		/*
		 * List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		 * 
		 * List<Integer> even = odd.stream().map(n -> n *
		 * 2).collect(Collectors.toList());
		 * 
		 * System.out.println("Even Number:" + even);
		 */

		Set<Integer> odd = new HashSet<Integer>();

		odd.add(1);
		odd.add(3);
		odd.add(4);
		odd.add(5);
		odd.add(7);
		
		Set<Integer> even = odd.stream().map(n -> n * 2).collect(Collectors.toSet());
		
		System.out.println("Even Numbers:" + even);

	}

}
