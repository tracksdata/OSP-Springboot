package com.cts.product.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Doctor;

@Repository
public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void saveDoctor(Doctor doc) {

		sf.getCurrentSession().save(doc);

	}

}
