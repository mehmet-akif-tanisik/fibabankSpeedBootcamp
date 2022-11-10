package com.matnsk.spring.service;

import java.util.List;

import com.matnsk.spring.Customer;

public interface CustomerService {

	
	Customer find(long customerId);
	
	List<Customer> findAll();
	
	void createCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(long customerId);
	
}
