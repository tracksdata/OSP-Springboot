package com.cts.product.service;


public interface ProductService {


	void findAll();

	void findById(int prodId);

	void findByName(String prodName);

	void saveProduct();

	void updateProduct();

	void deleteProduct();

}