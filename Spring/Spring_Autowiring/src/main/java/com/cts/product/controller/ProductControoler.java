package com.cts.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class ProductControoler {
	
	

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();
		prod.setPrice(34);
		prod.setProductId("P001");
		prod.setProductName("Mouse");

		ProductService ps = ac.getBean(ProductService.class);
		ps.saveProduct(prod);

	}

}
