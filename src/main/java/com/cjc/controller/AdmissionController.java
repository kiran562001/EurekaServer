package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.admissionservice.AdmissionService;
import com.cjc.dto.Department;
import com.cjc.dto.DtoAdmission;
import com.cjc.froxyService.FroxyService;
import com.cjc.model.Admission;

@RestController
@RequestMapping("/admission-con")
public class AdmissionController {
	@Autowired
	private AdmissionService service;
	
	
	
	@PostMapping("/admissions")
	public ResponseEntity<Admission> addAdmissions(@RequestBody Admission admission)
	{
		return new ResponseEntity<Admission>(service.addAdmission(admission),HttpStatus.CREATED);
	}
	
	@GetMapping("/admissions/department/{did}")
	public ResponseEntity<Department> getDepartment(@PathVariable int did)
	{
		System.out.println("application:: working");
		return new ResponseEntity<Department>(service.singleRecord(did),HttpStatus.OK);
	}
	@GetMapping("/admissions/admission/{sid}")
	public ResponseEntity<DtoAdmission> getsingle(@PathVariable int sid)
	{
		return new ResponseEntity<DtoAdmission>(service.getsingle(sid),HttpStatus.OK);
	}


}
