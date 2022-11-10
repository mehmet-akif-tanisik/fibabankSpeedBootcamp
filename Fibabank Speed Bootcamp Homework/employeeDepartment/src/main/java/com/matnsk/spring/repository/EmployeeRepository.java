package com.matnsk.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.matnsk.spring.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
	@Query("select e from Employee e where e.department.departmentId = :departmentId")
	List<Employee> findAllByDepartmentId(long departmentId);
	
	
	
}
