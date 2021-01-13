package com.snehal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snehal.dao.IEmployeeDAO;
import com.snehal.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	@Override
	public void deleteById(int id) {
		employeeDAO.deleteEmployee(id);
	}
	@Override
	public boolean addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
		return true;
	}
}
