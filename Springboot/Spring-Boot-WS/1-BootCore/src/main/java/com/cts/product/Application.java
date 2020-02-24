package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.cts.product.dao.ProductDao;


@SpringBootApplication
@ComponentScans(value = {@ComponentScan(basePackages = "com.cts.product"),@ComponentScan(basePackages = "com.cts.product.dao")})
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		Employee emp=ac.getBean(Employee.class);
		ProductDao prod=ac.getBean(ProductDao.class);
		prod.saveProduct();
		
		
		
		
	}

}
