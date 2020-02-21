package com.cts.product.service;

import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entity.Doctor;

public interface DoctorService {

	void saveDoctor(Doctor doc);

}