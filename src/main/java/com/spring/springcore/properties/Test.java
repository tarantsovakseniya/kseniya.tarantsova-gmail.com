package com.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/properties/propconfig.xml");
		Languages langs = (Languages) ctx.getBean("langs");
		System.out.println(langs);
	}
}