package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductSerrvice {

	List<Product> findAll();

	void saveProduct(Product prod) throws Exception;

	Product findById(int id);

	List<Product> findByName(String productName);

	Object updateProduct(Product newProduct) throws Exception;

	void deleteById(int id);
}
