package com.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

import com.product.config.AppConfig;
import com.product.service.ProductServiceImpl;

@EnableAspectJAutoProxy
public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		ps.findById("P001");
		ps.findByName("Pen");

		ac.close();

	}

}
