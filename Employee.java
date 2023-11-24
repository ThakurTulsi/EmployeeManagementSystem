package com.tulsi.empapp;


//This is our POJO (plain old Java object)class 

public class Employee {
	//creating attributes of the employee object
	private int id; //employee id
	private String name; //employee name
	private double salary; //employee salary
	private int age; //employee age
	
	//creating constructor
	
	public Employee(int id, String name, double salary, int age) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	//creating default constructor
	
	public Employee() {
		
	}
	
	//creating getters and setters for the above respective fields
	
	public int getId() { //getter
		return id;
	}
	
	public void setId(int id) { //setter
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
	//creating toString
	
	@Override
	public String toString() {
		return "Employee{"+
	            "id=" + id +
	            ", name=' " + name + '\''+
	            ", salary=" + salary +
	            ", age=" + age +
	            '}';
	            
	}
	

}
