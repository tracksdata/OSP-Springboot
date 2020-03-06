package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	List<Product> findAll();
	public List<Product> findProductByNameLike(String productName);


}