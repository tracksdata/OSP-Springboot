package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

public interface ProductService {

	// save product
	boolean saveProduct(Product product);

	Product findById(String productId);

	List<Product> findByName(String productName);

	List<Product> findAll();

	//void setProdDao(ProductDao prodDao);

}