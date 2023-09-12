package com.cjc.admissionserviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.admissionservice.AdmissionService;
import com.cjc.dao.admissionRepository;
import com.cjc.dto.Department;
import com.cjc.dto.DtoAdmission;
import com.cjc.froxyService.FroxyService;
import com.cjc.model.Admission;

@Service
public class AdmissionServiceImp implements AdmissionService{
	@Autowired
	private admissionRepository repo;
	@Autowired
	private FroxyService fservice;

	
	@Override
	public Admission addAdmission(Admission admission) {
		
		return repo.save(admission);
	}


	@Override
	public Department singleRecord(int did) {
		
		return fservice.singleRecord(did);
	}


	@Override
	public DtoAdmission getsingle(int sid) {
		if(repo.existsById(sid))
		{
			Admission admission = repo.findById(sid).get();
			
			Department sr= fservice.singleRecord(admission.getDepartmentId());
			System.out.println(sr);
			 
			DtoAdmission dto=new DtoAdmission(sid, sr.getdId(), sr.getdName());
			return dto;
		}
		return null;
	}

}
