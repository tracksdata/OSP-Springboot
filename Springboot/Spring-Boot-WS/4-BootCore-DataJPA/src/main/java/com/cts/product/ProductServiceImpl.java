package com.cts.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductDao prodDao;
	
	public void saveProduct(Product prod) {
		prodDao.save(prod);
		
		}
	
	public List<Product> findAll(){
		return prodDao.findAll();
	}
	
	

}
