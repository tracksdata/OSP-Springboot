package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	private int patId;
	private String patName;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int patId, String patName) {

		this.patId = patId;
		this.patName = patName;
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

}
