package com.cts.product;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// Save Product

		Product product = new Product();
		product.setProductId(18);
		product.setProductName("Dell Laptop");
		product.setPrice(150000);
		product.setProductDate(LocalDate.of(2020, 2, 29));

		ps.saveProduct(product);

		System.out.println("--- Done ");

	}

}
