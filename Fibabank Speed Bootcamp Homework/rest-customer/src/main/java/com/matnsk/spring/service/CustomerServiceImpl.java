package com.matnsk.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.matnsk.spring.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public Customer find(long customerId) {
		Customer customer = new Customer(customerId,"Ali",3450);
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(41,"Veli",2500));
		customerList.add(new Customer(42,"Ahmet",3000));
		customerList.add(new Customer(43,"Harun",1000));
		
		return customerList;
	}

	@Override
	public void createCustomer(Customer customer) {
		customer.setCustomerId(301);
		System.out.println("Ürün eklendi " + customer.getCustomerId() + " " + customer.getCustomerName() + " " +
				customer.getTotalDebit());
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Ürün güncellendi " + customer.getCustomerId() + " " + customer.getCustomerName() + " " +
				customer.getTotalDebit());
		
	}

	@Override
	public void deleteCustomer(long customerId) {
		System.out.println("Ürün silindi " + customerId);
		
	}

}
