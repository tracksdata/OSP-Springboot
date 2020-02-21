package com.cts.product.dao;

public interface SeniorAssociateDao {

	void findAll();

	void findById(int prodId);

	void findByName(String prodName);

	void saveProduct();

	void updateProduct();

	void deleteProduct();

}