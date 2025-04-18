package com.demoExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoExample.entity.HospitalEntity;

public interface HospitalRepo extends JpaRepository<HospitalEntity, Integer> {
	
	
	public void deleteByPatientName(String patientName);

}
