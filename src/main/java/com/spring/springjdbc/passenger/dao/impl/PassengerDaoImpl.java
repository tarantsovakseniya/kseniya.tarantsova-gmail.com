package com.spring.springjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.springjdbc.passenger.dao.PassengerDao;
import com.spring.springjdbc.passenger.dao.rowmapper.PassengerRowMapper;
import com.spring.springjdbc.passenger.dto.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values (?,?,?)";
		int result = jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id=?)";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public List<Passenger> read() {
		String sql = "select * from passenger";
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		List<Passenger> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}
}