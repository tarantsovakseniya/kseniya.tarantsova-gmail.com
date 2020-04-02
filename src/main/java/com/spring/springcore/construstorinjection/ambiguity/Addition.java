package com.spring.springcore.construstorinjection.ambiguity;

public class Addition {
	

	Addition(int a, double b) {
		System.out.println("Inside constructor Constructor");
		System.out.println("a: " + a + ", b: " + b);
	}
	
	
}