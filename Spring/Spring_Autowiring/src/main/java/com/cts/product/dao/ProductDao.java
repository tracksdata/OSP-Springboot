package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	boolean saveProduct(Product product);

	// find product by Product Id
	Product findById(String productId);

	List<Product> findByName(String productName);

	// find all Products
	List<Product> findAll();

}