package com.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/propertiesplaceholder/config.xml");
		MyDAO mydao = (MyDAO) context.getBean("myDAO");
		System.out.println(mydao);
	}
}
