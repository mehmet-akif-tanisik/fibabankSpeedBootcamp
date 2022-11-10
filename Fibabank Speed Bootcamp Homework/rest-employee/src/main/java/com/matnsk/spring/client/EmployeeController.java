package com.matnsk.spring.client;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.matnsk.spring.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/employee/get")
	@ResponseBody
	public String getEmployee() {
		long employeeId = 999;
		String url = "http://localhost:8080/api/employee/" + employeeId;
		
		RestTemplate restTemplate = new RestTemplate();
		Employee employee = restTemplate.getForObject(url, Employee.class);
		
		System.out.println("Employee: " + employee.getEmployeeName() +"" + employee.getEmployeeId());
		return "Get succesfully";
	}
	
	@GetMapping("/employees/get")
	@ResponseBody
	public String getEmployees() {
		String url = "http://localhost:8080/api/employees/";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Employee[]> response =
				  restTemplate.getForEntity(
				  url,
				  Employee[].class);
		
		Employee[] employees = response.getBody();
		
		for(int i=0 ; i<employees.length; i++) {
			System.out.println(employees[i].getEmployeeId());
		}
		
		return "Get employees succesfully done.";
	}
	
	
	
	
	@GetMapping("/employee/post")
	@ResponseBody
	public String postEmployee() {
		Employee employee = new Employee(222,"Harun",999);
		String url = "http://localhost:8080/api/employee/";
		
		RestTemplate restTemplate = new RestTemplate();
		Employee result = restTemplate.postForObject(url, employee, Employee.class);
		
		return "Post Succesfully " + result.getEmployeeId();
	}
	
	@GetMapping("/employee/put")
	@ResponseBody
	public String putEmployee() {
		Employee employee = new Employee(444,"Tuncay",5674);
		String url = "http://localhost:8080/api/employee/";
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.exchange(url,HttpMethod.PUT, new HttpEntity<Employee>(employee), Void.class);
		
		return "PUT succesfully";
	}
	
	@GetMapping("/employee/delete")
	@ResponseBody
	public String deleteEmployee() {
		long employeeId = 303;
		String url = "http://localhost:8080/api/employee/" + employeeId;
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(url);
		
		return "DELETE succesfully";
	}
	
	
	
	
	
	
	
	
	

}
