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
	
	public List<Product> findProductsByName(String productName){
		return prodDao.findProductByProductNameLike(productName);
	}

	@Override
	public void saveProduct(Product prod) {
		prodDao.save(prod);
	}

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	public Product findProductById(int prodId) {
		return prodDao.findById(prodId).orElse(null);
	}

	@Override
	public void updateProduct(Product prod) {
		prodDao.save(prod);
	}

	@Override
	public void deleteProduct(int prodId) {
		prodDao.deleteById(prodId);
	}

	@Override
	public void deleteProductByObject(Product prod) {
		prodDao.delete(prod);
	}

}
