package com.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		System.out.println(cardealer.getName() + " " + cardealer.getModels().getClass().getName());
	}

}
