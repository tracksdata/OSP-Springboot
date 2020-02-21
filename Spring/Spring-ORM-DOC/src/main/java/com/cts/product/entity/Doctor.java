package com.cts.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int docId, String docName) {

		this.docId = docId;
		this.docName = docName;
	}

	@Id
	private int docId;
	private String docName;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="pat_info",joinColumns = {@JoinColumn(name="docId")},inverseJoinColumns = {@JoinColumn(name="patId")} )
	List<Patient> patients = new ArrayList<Patient>();

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

}
