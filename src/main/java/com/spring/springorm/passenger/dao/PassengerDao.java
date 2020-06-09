package com.spring.springorm.passenger.dao;

import java.util.List;

import com.spring.springorm.passenger.entity.Passenger;

public interface PassengerDao {
	
	int save(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger get(int id);

	List<Passenger> loadAll();
}