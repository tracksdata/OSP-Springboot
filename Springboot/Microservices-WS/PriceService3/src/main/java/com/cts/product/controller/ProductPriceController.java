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
		Double price = prodPrice.getPrice(id);
		System.out.println("======> Getting price from Port 2224 and Price is  " + price + " <======");
		return prodPrice.getPrice(id);
	}

}
