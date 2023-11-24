//Main class of Employee Management System

package com.tulsi.empapp;

import java.sql.SQLOutput;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

import jdk.swing.interop.SwingInterOpUtils;

//main class

public class Main {
	//main method
	public static void main(String args[]) {
		String name;
		int id;
		
		//firstly we need to create objects of our interfaces
		EmployeeDAOIntf dao=new EmployeeDAOImpl(); 
		
		//dao is object or referenced name we 
		//can access all methods defined in employeeDAO Interface
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Employee Management Application\n");
		
		do {
			System.out.println("\n1. Add employee\n"+ "2. Show all employees\n"+ "3. Show employee based on ID\n"+ "4. Update name of employee\n"+
		"5. Delete Employee\n"+"6. To Exit\n ");
			System.out.println("Please enter your choice: ");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				//adding employee
				Employee emp=new Employee();//object emp of class employee
				
				//these employee details we need to take from user
				System.out.println("Enter ID: ");
				id=sc.nextInt();
				System.out.println("Enter Name: ");
				name=sc.next();
				System.out.println("Enter Salary: ");
				double salary=sc.nextDouble();
				System.out.println("Enter age: ");
				int age=sc.nextInt();
				
				//after getting details we need to set these details to object employee i.e emp
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				

				
				dao.createEmployee(emp);
				break;
			
			case 2:
				//showing all employees
				dao.showAllEmployee();
				break;
			case 3:
				//show employee based on id
				System.out.println("Enter employee id to show details: ");
				int empid=sc.nextInt();
				dao.showEmployeeBasedOnId(empid);
				break;
			case 4:
				//update name of employee
				System.out.println("Enter id to update details of employee: ");
				int empid1=sc.nextInt();
				System.out.println("Enter new name of employee to update: ");
				name=sc.next();

				dao.updateEmployee(empid1, name);
				break;
			case 5:
				//delete the employee
				System.out.println("Enter the employee id to delete: ");
				id=sc.nextInt();
				dao.deleteEmployee(id);
				break;
				
			case 6:
				System.out.println("Thank you for using our application");
				
				System.exit(0);
			default:
				System.out.println("Inavlid choice! Please enter valid choice from menu");
				break;
				
			
				
			
			}
			
			
		}
		while(true);
		
	}

}
