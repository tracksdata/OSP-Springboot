package com.cts.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Doctor;
import com.cts.product.entity.Patient;
import com.cts.product.entity.Product;
import com.cts.product.service.DoctorService;
import com.cts.product.service.ProductSerrvice;

public class Test {

	public static void main(String[] args) throws Exception {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		DoctorService ds = ac.getBean(DoctorService.class);

		Doctor d1 = new Doctor(10, "D1");
		Doctor d2 = new Doctor(11, "D2");
		Doctor d3 = new Doctor(12, "D3");

		Patient p1 = new Patient(1024, "P1");
		Patient p2 = new Patient(1025, "P2");
		Patient p3 = new Patient(1026, "P3");
		Patient p4 = new Patient(1027, "P4");
		Patient p5 = new Patient(1028, "P5");

		d1.getPatients().add(p1);
		d1.getPatients().add(p2);
		d1.getPatients().add(p3);
		d1.getPatients().add(p4);

		d2.getPatients().add(p1);
		d2.getPatients().add(p3);
		d2.getPatients().add(p5);

		d3.getPatients().add(p1);
		d3.getPatients().add(p2);
		d3.getPatients().add(p3);
		d3.getPatients().add(p4);
		d3.getPatients().add(p5);

		ds.saveDoctor(d1);
		ds.saveDoctor(d2);
		ds.saveDoctor(d3);

		System.out.println("--- Done ----");

	}

}
