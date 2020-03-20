package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductRepository;
import com.cts.product.entity.Product;
import com.cts.product.entity.Review;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prodDao;

	@Override
	public List<Review> findReviewsByProduct(int id) {
		return prodDao.findReviewsByProduct(id);
	}

	public List<Product> findAll() {
		return prodDao.findAll();
	}

	public Product finfById(int id) {
		return prodDao.findById(id).orElse(null);
	}

	@Override
	public List<Product> findProductByNameLike(String name) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(name);
	}

}
