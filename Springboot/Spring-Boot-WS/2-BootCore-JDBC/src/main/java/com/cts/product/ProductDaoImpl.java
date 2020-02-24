package com.cts.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List getCount() {
		
		return jt.queryForList("select * from employee");
	}
	
	
	
}
