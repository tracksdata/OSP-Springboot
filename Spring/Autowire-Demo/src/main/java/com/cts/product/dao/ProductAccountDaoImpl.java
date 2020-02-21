package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductAccountDaoImpl implements  SeniorAssociateDao{

	public void findAll() {
		System.out.println("-- Product  Account Dao: Find All");
	}

	public void findById(int prodId) {
		System.out.println("Product Account Dao: Find By Product Id");
	}

	public void findByName(String prodName) {
		System.out.println("Product  Account Dao: Find By Product Name");
	}

	public void saveProduct() {
		System.out.println(" Product Account Dao: Sav Product");
	}

	public void updateProduct() {
		System.out.println("Product Account Dao: Update Product");
	}

	public void deleteProduct() {
		System.out.println("Product Account Dao:  Delete Product");
	}

}
