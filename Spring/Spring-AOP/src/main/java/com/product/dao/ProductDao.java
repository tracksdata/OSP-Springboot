package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	Product findById(String prodId);

	List<Product> findByName(String prodName);

}