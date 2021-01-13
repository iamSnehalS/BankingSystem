package com.snehal.dao;
import java.util.List;

import com.snehal.entity.Employee;
public interface IEmployeeDAO {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
}
 