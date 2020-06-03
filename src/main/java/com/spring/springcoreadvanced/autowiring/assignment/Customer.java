package com.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	@Autowired
	private Reservation reservation;
	private String name;

	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + ", name=" + name + "]";
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
