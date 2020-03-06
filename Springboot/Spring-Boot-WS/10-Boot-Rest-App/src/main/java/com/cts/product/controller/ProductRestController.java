package com.cts.product.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entities.Product;

@RestController
@RequestMapping("/api/products/v1")
public class ProductRestController {
	
	@GetMapping("/greet")
	public String f1() {
		return "Good Morning";
	}

	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public Product f2() {
		Product product = new Product();
		product.setProductId("P001");
		product.setProductName("Laptop");
		product.setPrice(250000);
		return product;
	}
	
	@GetMapping("/cities")
	public String[] getCities() {
		String[] cities= {"Chenai","Hyderabad","Pune","Kolkata"};
		return cities;
	}
	
	
	

}
