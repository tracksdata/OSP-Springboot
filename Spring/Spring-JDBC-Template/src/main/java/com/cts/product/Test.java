package com.cts.product;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		System.out.println("--- Stated..");
		
		
		ProductDaoImpl dao=ac.getBean(ProductDaoImpl.class);
		
		Product prod=new Product();
		prod.setProductId(1117);
		prod.setProductName("Sring-JDBC-Test");
		prod.setPrice(65);
		
	//	dao.saveProduct(prod);
		
		List<Product> prods=dao.findAll_V1();
		
		
		/*for(Product product:prods) {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		}
		
		
		
		System.out.println("Total: "+dao.findAll().size());
		
		*/
	
		/*
		dao.findByName("Test").forEach(product->{
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		});
		
		*/
		
		
		Product product=dao.findById(1024);
		
		if(product!=null) {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		}else {
			System.out.println("Product id not found");
		}
		
		
		
		
		ac.close();

	}

}
