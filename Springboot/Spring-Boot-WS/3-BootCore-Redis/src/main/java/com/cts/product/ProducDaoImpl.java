package com.cts.product;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProducDaoImpl {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	@Resource(name="redisTemplate")
	private ListOperations<String, String> listOps;
	
	
	public Product save(String key, Product product) {
		
		listOps.leftPush(key, "Cognizant");
		System.out.println("---- Saved...");
		return product;
	}

	
	
	
}
