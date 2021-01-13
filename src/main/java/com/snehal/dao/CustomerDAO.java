package com.snehal.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.snehal.entity.Customer;

@Transactional
@Repository
public class CustomerDAO implements ICustomerDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@Override
	public List<Customer> getAllCustomers() {
		
		String hql = "FROM Customer as cust ORDER BY cust.cid";
		return (List<Customer>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public Customer getCustomerById(int cid) {
		return entityManager.find(Customer.class, cid);
	}
	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
	}
	@Override
	public void deleteCustomer(int cid) {
		entityManager.remove(getCustomerById(cid));

	}
}
