package com.cjc.admissionservice;

import com.cjc.dto.Department;
import com.cjc.dto.DtoAdmission;
import com.cjc.model.Admission;

public interface AdmissionService {

	Admission addAdmission(Admission admission);

	Department singleRecord(int did);

	DtoAdmission getsingle(int sid);

}
