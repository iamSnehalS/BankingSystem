package com.snehal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snehal.dao.ICustomerDAO;
import com.snehal.entity.Customer;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private ICustomerDAO customerDAO;

	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}
	@Override
	public Customer getCustomerById(int cid) {
		return customerDAO.getCustomerById(cid);
	}
	@Override
	public boolean addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
		return true;
	}
	@Override
	public void deleteCustomer(int cid) {
		customerDAO.deleteCustomer(cid);
	}
}
