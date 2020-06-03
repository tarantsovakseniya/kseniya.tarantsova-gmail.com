package com.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcoreadvanced/autowiring/assignment/config.xml");
	 Customer customer = (Customer) context.getBean("Customer");
	 System.out.println(customer);
	}
}
