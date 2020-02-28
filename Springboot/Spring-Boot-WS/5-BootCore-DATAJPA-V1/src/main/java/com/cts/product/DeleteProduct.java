package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class DeleteProduct {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DeleteProduct.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// find Product By Id

		ps.deleteById(10);
		
		System.out.println("-- DOne");
		

	}
}
