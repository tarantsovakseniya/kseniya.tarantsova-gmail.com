package com.spring.springcore.propertiesplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/propertiesplaceholder/assignment/config.xml");
		Client client = (Client) context.getBean("client");
		System.out.println(client);
	}
}