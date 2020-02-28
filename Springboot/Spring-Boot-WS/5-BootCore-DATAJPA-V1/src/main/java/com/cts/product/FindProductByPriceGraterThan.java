package com.cts.product;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class FindProductByPriceGraterThan {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FindProductByPriceGraterThan.class, args);
		ProductService ps = ac.getBean(ProductService.class);

		// find Products By ProductNames
		
		List<Product> prods=ps.findProductByPriceGreaterThanEqual(1000);
		
		for(Product prod:prods) {
			System.out.println(prod.getProductId());
			System.out.println(prod.getProductName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getProductDate());
			System.out.println("----------------------------------");
		}
		

	}

}
