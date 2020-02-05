package com.cts.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cts.emp.exception.EmployeeException;
import com.cts.emp.model.Employee;
import com.cts.emp.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int addEmployees(List<Employee> employees) throws EmployeeException {
		Connection con=DbUtil.getConnection();
		int sum=0;
		try {
			PreparedStatement stat=
					con.prepareStatement
					("insert into Employee values (?,?,?,?,?)");
			
			for (Employee employee : employees) {
				stat.setInt(1, employee.getId());
				stat.setString(2, employee.getName());
				stat.setString(3, employee.getGender());
				stat.setInt(4, employee.getAge());
				stat.setString(5, employee.getDeptId());
				sum=sum+stat.executeUpdate();
				
				
			}
			return sum;
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		
	}

}
