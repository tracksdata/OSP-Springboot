package com.product.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDao prodDao;


	

	
	public void saveProduct(Product prod) {
		System.out.println("-- service: Saving product");
		prodDao.saveProduct(prod);
	}

	
	public Product findById(String prodId) {
		System.out.println("-- service: Find by id");
		return prodDao.findById(prodId);
	}

	public List<Product> findByName(String prodName) {
		System.out.println("-- service: Find by name");
		return prodDao.findByName(prodName);
	}

}
