package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.cjc.dto.Department;

@Entity
public class Admission {
	@Id
	private int studentId;
	private String studentName;
	private int departmentId;
	private int courseID;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public Admission(int studentId, String studentName, int departmentId, int courseID) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.departmentId = departmentId;
		this.courseID = courseID;
	}
	@Override
	public String toString() {
		return "Admission [studentId=" + studentId + ", studentName=" + studentName + ", departmentId=" + departmentId
				+ ", courseID=" + courseID + "]";
	}
	public Admission() {
		
	}
	
	
	}
