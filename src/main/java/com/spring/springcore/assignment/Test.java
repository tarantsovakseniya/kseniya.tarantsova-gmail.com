package com.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/assignment/assignconfig.xml");
		ShoppingCart cart = (ShoppingCart) ctx.getBean("cart");
		System.out.println(cart);
	}
}