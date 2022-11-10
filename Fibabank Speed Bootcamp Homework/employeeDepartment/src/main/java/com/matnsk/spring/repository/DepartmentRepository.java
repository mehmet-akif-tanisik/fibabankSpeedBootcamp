package com.matnsk.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.matnsk.spring.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
