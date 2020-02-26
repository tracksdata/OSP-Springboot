package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ApplicationContext ac=SpringApplication.run(Application.class, args);
		ProductDaoImpl productDao= ac.getBean(ProductDaoImpl.class);
		
		Product prod=new Product();
		prod.setProductId("P001");
		prod.setProductName("Laptop");
		prod.setPrice(250000);
		
		productDao.saveProduct(prod);
		
		
		 
	}

}
