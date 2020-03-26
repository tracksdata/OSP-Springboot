package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductPriceDao;

@RestController
@CrossOrigin
@RequestMapping("/price")
public class ProductPriceController {
	
	@Autowired
	private ProductPriceDao prodPrice;
	
	@GetMapping("/get/{id}")
	public Double getPrice(@PathVariable int id) {
		return prodPrice.getPrice(id);
	}

}
