package com.cts.product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {
	

	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public void saveProduct(Product prod) {
		em.persist(prod);
	}

}
