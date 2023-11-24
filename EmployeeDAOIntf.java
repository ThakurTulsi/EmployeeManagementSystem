//This is our employee interface 

package com.birlasoft.empapp;

public interface EmployeeDAOIntf {
	
	//inside our interface class we write what crud operations we will perform i.e all the methods
	
    //Operations:	
	//1. Create Employee
	public void createEmployee(Employee emp);
	//2. Display all employees
	public void showAllEmployee();
	//3. Display employee based on employee id
	public void showEmployeeBasedOnId(int id);
	//4. Update employee
	public void updateEmployee(int id, String name);
	//5. Delete employee
	public void deleteEmployee(int id);
	
	
	
	


}
