package com.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
public class ProductDaopImpl implements ProductDao {

	public void saveProduct(Product prod) {
		System.out.println("Dao: --- saving prduct");
	}

	public Product findById(String prodId) {
		System.out.println("Dao: --Find by id");
		return null;
	}

	public List<Product> findByName(String prodName) {
		System.out.println("Dao: --Find by name");
		return null;
	}

}
