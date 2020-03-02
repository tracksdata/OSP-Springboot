package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping(value = "/data")
	public void test() {
		System.out.println("====> test method of ProductController class");
	}
	
	@RequestMapping("/d1")
	public String testMethod() {
		System.out.println("--- test method");
		return "welcome";
	}
	
}
