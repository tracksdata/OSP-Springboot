package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;
import com.cts.product.entity.Review;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("from Review r where r.product.id=:id")
	List<Review> findReviewsByProduct(int id);
	
	
	List<Product> findProductByNameLike(String name);

}
