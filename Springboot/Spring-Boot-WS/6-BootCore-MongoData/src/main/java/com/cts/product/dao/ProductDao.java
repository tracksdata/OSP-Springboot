package com.cts.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.collections.Product;

public interface ProductDao extends MongoRepository<Product, Long> {

}
