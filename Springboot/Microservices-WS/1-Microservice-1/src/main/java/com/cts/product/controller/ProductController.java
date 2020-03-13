package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;


@RestController
@CrossOrigin
@RequestMapping("api/products/v1")
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public List<Product> findAll(){
		return ps.findAll();
	}

}
