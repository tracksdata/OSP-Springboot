package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.product.dao.SeniorAssociateDao;

@Service
public class ProductAccountServiceImpl implements ProductService {

	@Autowired
	@Qualifier(value = "productAccountDaoImpl")
	private SeniorAssociateDao sad;
	public void findAll() {
		sad.findAll();
		// TODO Auto-generated method stub
		
	}

	public void findById(int prodId) {
		// TODO Auto-generated method stub
		
	}

	public void findByName(String prodName) {
		// TODO Auto-generated method stub
		
	}

	public void saveProduct() {
		sad.saveProduct();
		// TODO Auto-generated method stub
		
	}

	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

	
}
