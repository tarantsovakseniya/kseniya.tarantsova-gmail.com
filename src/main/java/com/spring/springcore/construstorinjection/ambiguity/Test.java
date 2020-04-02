package com.spring.springcore.construstorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/construstorinjection/ambiguity/config.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);
	}
}