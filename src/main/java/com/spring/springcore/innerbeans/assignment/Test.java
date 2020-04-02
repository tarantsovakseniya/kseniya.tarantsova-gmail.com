package com.spring.springcore.innerbeans.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/innerbeans/assignment/config.xml");
		University university = (University) ctx.getBean("university");
		System.out.println(university.hashCode());
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2.hashCode());
	}
}