package com.snehal.dao;
import java.util.List;

import com.snehal.entity.Customer;
public interface ICustomerDAO {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int cid);
    void addCustomer(Customer customer);
    void deleteCustomer(int cid);
}
 