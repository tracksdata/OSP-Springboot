package com.cts.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductSerrvice;

public class Test {

	public static void main(String[] args) throws Exception {
	
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductSerrvice ps=ac.getBean(ProductSerrvice.class);
		/*
		for(Product prod:dao.findByName("%a")) {
			System.out.println(prod.getProductId());
			System.out.println(prod.getProductName());
			System.out.println(prod.getPrice());
			System.out.println("------------------------------------");
		}
		
		*/
		
		Product prod=new Product();
		prod.setProductId(2003);
		prod.setProductName("Blue Pen");
		prod.setPrice(45.45);
		
		
		
		ps.saveProduct(prod); // New Transaction
	
		Product p=new Product();
		p.setProductId(1);
		p.setProductName("Cap");
		p.setPrice(32);
		
		//System.out.println("Service:===> "+System.identityHashCode(p));
	  	ps.updateProduct(p); // runs in a new Transaction
		
		
		
	
	/*
		//dao.updateProduct(prod);
		Product updatedProduct=(Product)dao.updateProduct(prod);
		
		if(updatedProduct!=null) {
			// message to updated
			System.out.println("--- Updated");
		}else {
			// exception to client about uopdate faluire
			System.out.println("Some issue while updating ");
		}
		//dao.saveProduct(prod);
		
		//dao.deleteById(3);
		
		
		/*
		Product p=dao.findById(1);
		
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
