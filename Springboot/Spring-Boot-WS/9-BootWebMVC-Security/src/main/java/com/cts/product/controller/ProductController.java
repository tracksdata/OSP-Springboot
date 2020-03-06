package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1")
	public void test() {
		System.out.println("======>  test method of ProductController");
	}

}
