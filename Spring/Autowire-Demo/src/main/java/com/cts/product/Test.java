package com.cts.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;

import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService ps=ac.getBean(ProductServiceImpl.class);

		ps.findAll();
		ps.saveProduct();
		
		
		

	}

}
