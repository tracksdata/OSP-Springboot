package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(product);
	}

	@Override
	public Product findById(String productId) {
		// TODO Auto-generated method stub
		return prodDao.findById(productId);
	}

	@Override
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return prodDao.findByName(productName);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

}
