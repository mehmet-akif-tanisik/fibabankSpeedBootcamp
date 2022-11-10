package com.matnsk.spring.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matnsk.spring.Employee;

@RestController
public class EmployeeResource {
	
	
	//Get Method to get single item
	@GetMapping("/api/employee/{id}")
	public Employee getEmployee(@PathVariable("id")long employeeId) {
		
		Employee employee = new Employee(100,"Mehmet",3000);
		
		return employee;
	}
	
	//Get Method to get all employees
	@GetMapping("/api/employees")
	public List<Employee> getEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(100,"John",1000));
		employeeList.add(new Employee(101,"Camron",2000));
		employeeList.add(new Employee(102,"Trun",3000));
		
		return employeeList;
	}
	
	//Post Method to save new employee
	@PostMapping("/api/employee")
	public Employee postEmployee(@RequestBody Employee employee) {
		employee.setEmployeeId(444);
		System.out.println("Employee has been added succesfully:" +
							"\nEmployee id: " + employee.getEmployeeId() +
							"\nEmployee name: " + employee.getEmployeeName() +
							"\nEmployee salary: "+ employee.getMonthlySalary());
		
		return employee;
	}
	
	//Put method to update an employee
	@PutMapping("/api/employee")
	public void putEmployee(@RequestBody Employee employee) {
		System.out.println("Employee has been updated succesfully:" +
				"\nEmployee id: " + employee.getEmployeeId() +
				"\nEmployee name: " + employee.getEmployeeName() +
				"\nEmployee salary: "+ employee.getMonthlySalary());
	}
	
	
	
	@DeleteMapping("/api/employee/{id}")
	public void deleteEmployee(@PathVariable("id") long employeeId) {
		System.out.println("Ürün silindi " + employeeId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
