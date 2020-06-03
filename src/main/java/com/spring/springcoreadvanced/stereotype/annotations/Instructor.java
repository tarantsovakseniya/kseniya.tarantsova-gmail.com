package com.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	// @Value("#{44+66}")
	// @Value("#{T(java.lang.Math).abs(-99)}")
	// @Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;

	// @Value("Kseniia")
	// @Value("#{'Kseniia'.toUpperCase()}")
	@Value("#{new java.lang.String('Kseniia')}")
	private String name;

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{2+4<8?false:true}")
	private boolean active;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile=" + profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
