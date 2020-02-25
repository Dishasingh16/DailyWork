package com.cts.training.dao.impl;

import java.util.List;

import com.cts.training.bean.Employee;

public interface EmployeeDao  {

	
	public boolean deleteEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployees();

	public boolean updateEmployee(Employee emp);

	

}
