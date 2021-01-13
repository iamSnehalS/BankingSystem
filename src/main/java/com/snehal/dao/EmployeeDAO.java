package com.snehal.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.snehal.entity.Employee;

@Transactional
@Repository
public class EmployeeDAO implements IEmployeeDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@Override
	public void deleteEmployee(int id) {
		entityManager.remove(entityManager.find(Employee.class, id));
		
	}	
	@Override
	public List<Employee> getAllEmployees() {
		String hql = "FROM Employee as emp ORDER BY emp.id";
		return (List<Employee>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}
}
