package com.demoExample.Controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoExample.Repository.HospitalRepo;
import com.demoExample.entity.HospitalEntity;

@RestController
@RequestMapping("/hospital/api")
@Transactional
public class HospitalController {
	
	@Autowired
	private HospitalRepo hospital;
	
	@PostMapping
	public ResponseEntity<HospitalEntity> saveEmployee(@RequestBody HospitalEntity hospitalentity){
		
		HospitalEntity h1=hospital.save(hospitalentity);
		
		return ResponseEntity.ok(h1);
	}
	
	
	@GetMapping
	public List<HospitalEntity> getDetails(){
		return hospital.findAll();
	}
	
	
	@GetMapping("/user/{id}")
	public Optional<HospitalEntity> getDetailsById(@PathVariable int id){
		return hospital.findById(id);
	}
	
	
	@DeleteMapping("/abc/{id}")
	public List<HospitalEntity> deleteDetails(@PathVariable int id){
		hospital.deleteById(id);
		return hospital.findAll();
	}
	
	
	@DeleteMapping("/xyz/{patientName}")
	public List<HospitalEntity> deleteDetails(@PathVariable String patientName){
		
		hospital.deleteByPatientName(patientName);
		
		
		
		return hospital.findAll();
		
	}
	
	
	
	
	
	
	
	
	
	

}


