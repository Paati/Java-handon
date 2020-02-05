package com.cts.emp.dao;

import java.util.List;

import com.cts.emp.exception.EmployeeException;
import com.cts.emp.model.Employee;

public interface EmployeeDao {

	int addEmployees(List<Employee> employees) 
					throws EmployeeException;
	
}
