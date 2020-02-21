package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements SeniorAssociateDao, JuniorAssociate {

	public void findAll() {
		System.out.println("-- Product Dao: Find All");
	}

	public void findById(int prodId) {
		System.out.println("Product Dao: Find By Product Id");
	}

	public void findByName(String prodName) {
		System.out.println("Product Dao: Find By Product Name");
	}

	public void saveProduct() {
		System.out.println(" Product nDao: Sav Product");
	}

	public void updateProduct() {
		System.out.println("Product Dao: Update Product");
	}

	public void deleteProduct() {
		System.out.println("Product Dao:  Delete Product");
	}

}
