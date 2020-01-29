package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	public ProductDaoImpl() {
		System.out.println("--- ProductDao class object created..");
	}

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
