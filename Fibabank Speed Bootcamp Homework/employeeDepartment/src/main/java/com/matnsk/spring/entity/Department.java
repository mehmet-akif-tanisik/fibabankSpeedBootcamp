package com.matnsk.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId;
	
	private String departmentName;
	
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Employee> employeeList;


	public Department() {
	}


	public Department(long departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}


	public long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	

}
