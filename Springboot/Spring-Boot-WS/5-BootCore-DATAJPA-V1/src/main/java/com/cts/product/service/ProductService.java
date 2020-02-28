package com.cts.product.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	// save product / update
	void saveProduct(Product product);

	// find product by Id
	Product findById(int productId);

	// find all products
	List<Product> findAll();

	// delete product by product id
	void deleteById(int productId);

	// delete product by entity object
	void deleteByObject(Product product);

	
	List<Product> findProductByProductNameLike(String productName);
	List<Product> findProductByPriceBetween(double startRange,double endRange);
	List<Product> findProductByProductDateBetween(LocalDate startDate,LocalDate endDate);
	List<Product> findProductByPriceGreaterThanEqual(double price);
	List<Product> findAllLaptops(String filterString);




}