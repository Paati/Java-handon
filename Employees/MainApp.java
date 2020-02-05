package com.cts.emp.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cts.emp.dao.EmployeeDao;
import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.exception.EmployeeException;
import com.cts.emp.model.Employee;

public class MainApp {
	static EmployeeDao dao=new EmployeeDaoImpl();
	public static void main(String[] args) {
		
		try {
			int result=addEmployees("employees.txt");
			System.out.println(result +" Row(s) Updated");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
		

	}
	
	public static int addEmployees(String fileName) throws EmployeeException{
		List<Employee> employees=new ArrayList<>();
		try {
			FileReader reader=new FileReader(fileName);
			BufferedReader br=new BufferedReader(reader);
			String line=null;
			while((line=br.readLine())!=null){
				Employee emp=new Employee();
				
				String[] data=line.split("-");
				emp.setId(Integer.parseInt(data[0]));
				if(!data[1].matches("[A-Z][A-Za-z\\s]{2,}")){
					throw new EmployeeException("Invalid Name");
				}
				else{
					emp.setName(data[1]);
				}
				if(data[2].equalsIgnoreCase("Male") 
						|| data[2].equalsIgnoreCase("Female")){
					//data[2].matches("^(Male|Female)$")
					emp.setGender(data[2]);
				}
				else{
					throw new EmployeeException("Invalid Gender");
				}
				if(Integer.parseInt(data[3])>=18 &&
						Integer.parseInt(data[3])<=60){
					emp.setAge(Integer.parseInt(data[3]));
				}
				else{
					throw new EmployeeException("Invalid Age");
					
				}
				if(data[4].startsWith("DE")){
					//data[4].matches("^DE[0-9]+$");
					emp.setDeptId(data[4]);
				}
				else{
					throw new EmployeeException("Invalid Age");
				}
				employees.add(emp);
			}
			return dao.addEmployees(employees);
			
			
		} catch (FileNotFoundException e) {
			throw new EmployeeException(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
		
	}
	
	public static List<Employee> getAllEmployees(){
		return null;
	}

}
