package com.spring.springjdbc.passenger.dao;

import java.util.List;

import com.spring.springjdbc.passenger.dto.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);

	int update(Passenger passenger);

	int delete(int id);

	List<Passenger> read();
}
