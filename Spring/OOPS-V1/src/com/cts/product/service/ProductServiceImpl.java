package com.cts.product.service;

import java.util.List;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

// Dependent class
public class ProductServiceImpl implements ProductService {
	
	
    private ProductDao prodDao;
    
    public ProductServiceImpl(ProductDao prodDao) {
		this.prodDao=prodDao;
	}

    /*
	public void setProdDao(ProductDao prodDao) {
		this.prodDao = prodDao;
	}
	*/
    

	// save product
	@Override
	public boolean saveProduct(Product product) {
		System.out.println("Service: Product " + product.getProductName() + " is saving to DB...");
		// code to save product object into database
		return prodDao.saveProduct(product);
	}

	// find product by Product Id

	@Override
	public Product findById(String productId) {

		return prodDao.findById(productId);
	}

	// find products by name

	@Override
	public List<Product> findByName(String productName) {

		return prodDao.findByName(productName);
	}

	// find all Products

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

}
