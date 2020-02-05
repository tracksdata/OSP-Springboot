package com.cts.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entity.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sf;
	

	public List<Product> findAll(){
		Session ses=sf.getCurrentSession();
		Query<Product> qry=ses.createQuery("from Product");
		List<Product> prods=qry.getResultList();
		return prods;
	}
	
	

	public void saveProduct(Product prod) {
		Session ses=sf.getCurrentSession();
		ses.save(prod);
	//	ses.beginTransaction().commit();
	}
	
	
	// find product by id
	
	
	public Product findById(int id) {
		return sf.getCurrentSession().get(Product.class, id);
	}
	
	// find Product By Name
	
	
	public List<Product> findByName(String productName){
		
		Session ses=sf.getCurrentSession();
		Query<Product> qry=ses.createQuery("from Product p where p.productName like :pn");
		qry.setParameter("pn", productName);
		return qry.getResultList();
		
	}
	
	public Object updateProduct(Product newProduct) throws RuntimeException {
		
		if(newProduct.getProductId()==1) {
			throw new RuntimeException("Product Id can not be updated");
		}
		
		return sf.getCurrentSession().merge(newProduct);
	}
	
	public void deleteById(int id) {
		sf.getCurrentSession().delete(sf.getCurrentSession().get(Product.class, id));
	}
	
	
	  
	
	
	
	
	
	

}
