package com.cts.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, String>{
	
	/*
	 *  1. Repository
	 *  2. CrudRepository - 11 
	 *  3. PagingAndSortingRepository - 2
	 *  4. JpaRepository - 11
	 *  
	 *  
	 *   Connection POOLS
	 *   ---------------------
	 *   1. Hicaki CP (default)
	 *   2. Tomcat connection pool - exclude
	 *   3. Dbcp2 connection pool   - exclude
	 *  
	 * 
	 * 
	 * 
	 */

}
