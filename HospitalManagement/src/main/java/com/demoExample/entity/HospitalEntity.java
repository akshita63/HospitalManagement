package com.demoExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HospitalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regid;
	private String patientName;
	private String hospitalName;
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public HospitalEntity(int regid, String patientName, String hospitalName) {
		super();
		this.regid = regid;
		this.patientName = patientName;
		this.hospitalName = hospitalName;
	}
	
	
	public HospitalEntity() {
	}
	
	
	
	
	
	
	
	

}
