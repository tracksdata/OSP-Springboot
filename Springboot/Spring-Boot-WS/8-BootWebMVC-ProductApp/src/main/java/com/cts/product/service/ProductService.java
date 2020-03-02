package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	public List<Product> findProductsByName(String productName);
	void saveProduct(Product prod);

	List<Product> findAll();

	Product findProductById(int prodId);

	void updateProduct(Product prod);

	void deleteProduct(int prodId);

	void deleteProductByObject(Product prod);

}