package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ApplicationContext ac=SpringApplication.run(Application.class, args);
	
		
		 ProductServiceImpl ps=ac.getBean(ProductServiceImpl.class);
		
		Product prod=new Product();
		prod.setProductId("P002");
		prod.setProductName("Pen");
		prod.setPrice(65);
		
		//ps.saveProduct(prod);
		
		
		for(Product p:ps.findAll()) {
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getPrice());
			System.out.println("-------------------------");
		}
		
		
		
		
		
		
		
		 
	}

}
