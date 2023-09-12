package com.cjc.dto;

public class DtoAdmission {
	
	private int studentId;
	private int dId;
	private String dName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public DtoAdmission() {
		
	}
	public DtoAdmission(int studentId, int dId, String dName) {
		super();
		this.studentId = studentId;
		this.dId = dId;
		this.dName = dName;
	}
	
	
	

}
