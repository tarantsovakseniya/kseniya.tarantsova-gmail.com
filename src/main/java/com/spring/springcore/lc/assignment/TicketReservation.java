package com.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private String reservationNumber;

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	@Override
	public String toString() {
		return "TicketReservation [reservationNumber=" + reservationNumber + "]";
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp");
	}

}
