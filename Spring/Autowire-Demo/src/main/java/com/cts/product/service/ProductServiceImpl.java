package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.cts.product.dao.SeniorAssociateDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier(value = "productDaoImpl")
	private SeniorAssociateDao sd;
	

	public void findAll() {
		sd.findAll();
	}

	public void findById(int prodId) {
		sd.findById(10);
	}

	public void findByName(String prodName) {
		sd.findByName("Pen");
	}

	public void saveProduct() {
		sd.saveProduct();
	}

	public void updateProduct() {
		System.out.println("Dao: Update Product");
	}

	public void deleteProduct() {
		System.out.println("Dao:  Delete Product");
	}

}
