package com.cts.product.controller;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

public class ProductControoler {

	public static void main(String[] args) {

		// Create Model class Object
		Product product = new Product();
		product.setProductId("P001");
		product.setProductName("Laptop");
		product.setPrice(45000);

		// Create Database / DAO class object : Dependency Object
		ProductDao prodDao = new ProductDaoImpl();
		// Create service class object
		ProductService prodService = new ProductServiceImpl(prodDao); // Dependent class
		// Inject DAO object into service class
		//prodService.setProdDao(prodDao); // DI

		// start invoking service class methods
		prodService.saveProduct(product);

	}

}
