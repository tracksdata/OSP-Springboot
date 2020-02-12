package com.cts.product.dao;

import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void saveEmployee(Employee emp) {
		sf.getCurrentSession().save(emp);
		System.out.println("Saved");
	}
}
