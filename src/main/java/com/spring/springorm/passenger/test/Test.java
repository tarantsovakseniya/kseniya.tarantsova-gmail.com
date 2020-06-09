package com.spring.springorm.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.passenger.dao.PassengerDao;
import com.spring.springorm.passenger.entity.Passenger;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");
		Passenger passenger = new Passenger();
		passenger.setId(7);
		passenger.setFirstName("Jeff");
		passenger.setLastName("Bezos");
		//passengerDao.save(passenger);
		//passengerDao.update(passenger);
		//System.out.println(passengerDao.get(7));
		//System.out.println(passengerDao.loadAll());
		passengerDao.delete(passenger);
	}
}