package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	public List<Product> findProductByNameLike(String productName) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(productName);
	}

}
