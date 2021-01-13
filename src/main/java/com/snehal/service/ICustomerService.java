package com.snehal.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.snehal.entity.Customer;


public interface ICustomerService {
	 @Secured ({"ROLE_USER"})
     List<Customer> getAllCustomers();
	 @Secured ({"ROLE_USER"})
	 Customer getCustomerById(int cid);
	 @Secured ({"ROLE_USER"})
     boolean addCustomer(Customer customer);
	 @Secured ({"ROLE_USER"})
     void deleteCustomer(int cid);
}
