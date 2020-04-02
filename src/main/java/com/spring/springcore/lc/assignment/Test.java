package com.spring.springcore.lc.assignment;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/lc/assignment/config.xml");
		TicketReservation reservation = (TicketReservation) ctx.getBean("reservation");
		System.out.println(reservation);
		ctx.registerShutdownHook();
	}
}