package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class FindProduct {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FindProduct.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// find Product By Id

		Product product = ps.findById(11);

		if (product == null) {
			System.out.println("Product Id does not Found in DB");
			return;
		}

		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		System.out.println(product.getProductDate());
		System.out.println("------------------------------");

	}

}
