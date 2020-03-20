package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;
import com.cts.product.entity.Review;

public interface ProductService {

	List<Review> findReviewsByProduct(int id);

	public List<Product> findAll();
	
	public Product finfById(int id) ;
	
	List<Product> findProductByNameLike(String name);

}