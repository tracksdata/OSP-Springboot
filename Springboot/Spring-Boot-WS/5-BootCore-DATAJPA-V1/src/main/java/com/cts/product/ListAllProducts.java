package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.service.ProductService;

@SpringBootApplication
public class ListAllProducts {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ListAllProducts.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// List ALL PRODUCTS

		ps.findAll().forEach(product -> {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println(product.getProductDate());
			System.out.println("------------------------------");
		});

	}

}
