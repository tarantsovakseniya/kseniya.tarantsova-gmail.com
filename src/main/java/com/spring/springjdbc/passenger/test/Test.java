package com.spring.springjdbc.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springjdbc.passenger.dao.impl.PassengerDaoImpl;
import com.spring.springjdbc.passenger.dto.Passenger;

public class Test {
	public static void main (String [] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springjdbc/passenger/test/config.xml");
		PassengerDaoImpl dao = (PassengerDaoImpl) ctx.getBean("passengerDao");
	
		Passenger passenger = new Passenger(1, "Kseniia", "Tarantsova");
		Passenger passengerChild = new Passenger(2, "Daria", "Tarantsova");
		dao.create(passenger);
		dao.create(passengerChild);
		
		passenger.setFirstName("Dmytro");
		dao.update(passenger);
		
		System.out.println(dao.read());
	}
}