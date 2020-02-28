package com.cts.product.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	// save product / update
	@Override
	public void saveProduct(Product product) {
		prodDao.save(product);
	}

	// find product by Id
	@Override
	public Product findById(int productId) {
		return prodDao.findById(productId).orElse(null);
	}

	// find all products
	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	// delete product by product id
	@Override
	public void deleteById(int productId) {
		prodDao.deleteById(productId);
	}

	// delete product by entity object
	@Override
	public void deleteByObject(Product product) {
		prodDao.delete(product);
	}

	@Override
	public List<Product> findProductByProductNameLike(String productName) {
		// TODO Auto-generated method stub
		return prodDao.findProductByProductNameLike(productName);
	}

	@Override
	public List<Product> findProductByPriceBetween(double startRange, double endRange) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceBetween(startRange, endRange);
	}

	@Override
	public List<Product> findProductByProductDateBetween(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return prodDao.findProductByProductDateBetween(startDate, endDate);
	}

	@Override
	public List<Product> findProductByPriceGreaterThanEqual(double price) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceGreaterThanEqual(price);
	}

	@Override
	public List<Product> findAllLaptops(String filterString) {
		// TODO Auto-generated method stub
		return prodDao.findAllLaptops(filterString);
	}

}
