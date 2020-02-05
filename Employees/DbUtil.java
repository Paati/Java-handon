package com.cts.emp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.emp.exception.EmployeeException;

public class DbUtil {

	public static Connection getConnection() throws EmployeeException{
		Properties props=new Properties();
		try {
			FileInputStream fis=new FileInputStream("src\\data.properties");
			props.load(fis);
			String url=props.getProperty("url");
			String driver=props.getProperty("driver");
			String userName=props.getProperty("user");
			String pwd=props.getProperty("password");
			Class.forName(driver);
			return DriverManager.getConnection(url,userName,pwd);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
	}
}
