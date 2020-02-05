package com.cts.emp.model;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String deptId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Employee(int id, String name, String gender, int age, String deptId) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.deptId = deptId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
