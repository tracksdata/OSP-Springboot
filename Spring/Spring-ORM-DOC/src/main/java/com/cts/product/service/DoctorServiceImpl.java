package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.DoctorDao;
import com.cts.product.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDao docDao;
	
	@Override
	@Transactional
	public void saveDoctor(Doctor doc) {
		docDao.saveDoctor(doc);
	}

}
