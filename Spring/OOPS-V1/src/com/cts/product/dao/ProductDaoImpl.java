package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

//Dependency 
public class ProductDaoImpl implements ProductDao {

	// Product DAO Operations

	// save Product

	@Override
	public boolean saveProduct(Product product) {
		System.out.println("DAO: Product " + product.getProductName() + " saved to Database...");
		// code to save product object into database
		return true;
	}

	// find product by Product Id
	@Override
	public Product findById(String productId) {

		return null;
	}

	// find products by name

	@Override
	public List<Product> findByName(String productName) {

		return null;
	}

	// find all Products
	@Override
	public List<Product> findAll() {
		return null;
	}

}
