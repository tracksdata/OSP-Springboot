package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.product.entity.Product;

public interface ProductPriceDao extends JpaRepository<Product, Integer> {
	@Query("select prod.price from Product prod where prod.id=:id")
	Double getPrice(@Param("id") int id);

}
