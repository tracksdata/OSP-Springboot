package com.cts.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;

public class ProductController {
	
	public static void main(String[] args) {
		
		
		// 1. Load Configuration class
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppConfig appConfig=ac.getBean(AppConfig.class);
		appConfig.f3();
		appConfig.f3();
		
		ac.close();
		
		
		
		
		
		
	}

}
