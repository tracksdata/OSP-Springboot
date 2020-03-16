package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> { 
	
	//public User findUserByUser(String userName);

}
