package com.spring.springorm.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springorm.passenger.dao.PassengerDao;
import com.spring.springorm.passenger.entity.Passenger;

@Component
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int save(Passenger passenger) {
		return (Integer) hibernateTemplate.save(passenger);
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	@Override
	@Transactional
	public Passenger get(int id) {
		return hibernateTemplate.get(Passenger.class, id);
	}

	@Override
	@Transactional
	public List<Passenger> loadAll() {
		return hibernateTemplate.loadAll(Passenger.class);
	}
}