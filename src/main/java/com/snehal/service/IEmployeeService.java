package com.snehal.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.snehal.entity.Employee;


public interface IEmployeeService {
	@Secured ({"ROLE_ADMIN"})
	List<Employee> getAllEmployees();
	@Secured ({"ROLE_ADMIN"})
	void deleteById(int id);
	@Secured ({"ROLE_ADMIN"})
	boolean addEmployee(Employee employee);
}
