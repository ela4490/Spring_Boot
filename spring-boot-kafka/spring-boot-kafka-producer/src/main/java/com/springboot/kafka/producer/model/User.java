package com.springboot.kafka.producer.model;

public class User {
	private String Name;
	private String Department;
	private Integer ID;
	
	public User(String name, String department, Integer iD) {
		super();
		Name = name;
		Department = department;
		ID = iD;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String department) {
		Department = department;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}

}
