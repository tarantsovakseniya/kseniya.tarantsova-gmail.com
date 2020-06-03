package com.spring.springcoreadvanced.autowiring.byTypeAndName;

public class Employee {
	
	private Address address1;

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Employee [address1=" + address1 + "]";
	}

}
