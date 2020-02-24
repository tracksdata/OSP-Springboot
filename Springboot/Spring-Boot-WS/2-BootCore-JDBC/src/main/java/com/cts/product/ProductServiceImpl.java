package com.cts.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	@Override
	public List<Object> getEmployees(){
		return prodDao.getCount();
	}
	

}
