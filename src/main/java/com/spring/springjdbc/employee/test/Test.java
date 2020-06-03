package com.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.EmployeeDao;
import com.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		/*Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Bob");
		employee.setLastName("Ferguson");*/
		//int result = dao.create(employee);
		//Employee employee = dao.read(2);
		System.out.println("number of records deleted are: " + dao.read().toString());
	}
}