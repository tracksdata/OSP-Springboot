package com.cts.product;

import java.math.BigInteger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.collections.Product;
import com.cts.product.dao.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		Product prod = new Product();
		prod.set_id(new BigInteger("10001"));
		prod.setProductName("Book");
		prod.setDescription("Note Book");
		prod.setPrice(655);

		//ps.saveProduct(prod);
		
		//System.out.println("======> "+ps.findAll().size());
		
		for(Product product:ps.findAll()) {
			System.out.println(product.get_id());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("----------------------------");
		}
		

		System.out.println("====> Done");

	}

}
