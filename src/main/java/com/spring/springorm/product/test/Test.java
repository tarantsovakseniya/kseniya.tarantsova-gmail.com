package com.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.product.dao.ProductDao;
import com.spring.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
		// Product product = new Product();
		// product.setId(1);
		// product.setName("iphone");
		// product.setDesc("Its awesome!");
		// product.setPrice(500);
		// productDao.create(product);
		// productDao.update(product);
		// productDao.delete(product);

		// System.out.println(productDao.find(1));
		System.out.println(productDao.findAll());
	}
}
