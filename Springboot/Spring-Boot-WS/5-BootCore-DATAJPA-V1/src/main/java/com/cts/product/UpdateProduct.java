package com.cts.product;


import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class UpdateProduct {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(UpdateProduct.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// Save Product

		Product product = new Product();
		product.setProductId(13);
		product.setProductName("Wireless Keyboard");
		product.setPrice(7500);
		product.setProductDate(LocalDate.of(2020, 1, 25));

		ps.saveProduct(product);

		System.out.println("--- Done ");

	}

}
