package com.cts.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("-- Testing ...");
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		ProductService prod=ac.getBean(ProductService.class);
		
		System.out.println(prod.getEmployees());
		
		for(Object row:prod.getEmployees()) {
			System.out.println(row);
			
		}
	}

}
