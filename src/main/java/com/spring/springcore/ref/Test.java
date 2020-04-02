package com.spring.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/ref/refconfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
	}
}