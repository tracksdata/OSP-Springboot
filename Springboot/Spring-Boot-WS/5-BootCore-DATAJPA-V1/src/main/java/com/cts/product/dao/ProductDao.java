package com.cts.product.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	
	// Custom DSL Queries
	List<Product> findProductByProductNameLike(String productName);
	List<Product> findProductByPriceBetween(double startRange,double endRange);
	List<Product> findProductByProductDateBetween(LocalDate startDate,LocalDate endDate);
	List<Product> findProductByPriceGreaterThanEqual(double price);
	
	// Custom Queries - JQL/HQL
	@Query("select p from Product p where p.productName like :filterString")
	List<Product> findAllLaptops(String filterString);

	
	@Query("update Product set p.productName=?,p.price=?,p.productDate where p.productId=?")
	void updateProduct(Product prod);
	
	
	
	
	
	
	
	
	
	
	

	
	
}



