package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	public void saveProduct() {
		System.out.println("Dao: Saving Product ");
	}

}
