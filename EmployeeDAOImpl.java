//this is our class which implements our employee interface i.e EmployeeIntf

package com.birlasoft.empapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDAOImpl implements EmployeeDAOIntf{
	Connection con;
	
	//Implementation of all the methods defined in employee interface class
	
	@Override
	public void createEmployee(Employee emp) {
		//firstly we need to get the connection
		con=DBConnection.createDBConnection();
		//query to insert data into table for adding new employees
		String query="insert into EMPLOYEE values(?,?,?,?)";
		try {
			
			PreparedStatement pstm=con.prepareStatement(query); //created statement object
			//we have set all the values of attributes of employee
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3, emp.getSalary());
			pstm.setInt(4, emp.getAge());
			int count=pstm.executeUpdate(); //since executeUpdate() is returning int i.e row count for insertion else 0 for not insertion
			if(count!=0) {
				System.out.println("Employee inserted successfully!\n");
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	@Override
	public void showAllEmployee() {
		con=DBConnection.createDBConnection();
		String query="select * from EMPLOYEE";
		System.out.println("Employee details:\n");
		System.out.println("-----------------------------------------------------");

		System.out.format("\n%S\t%S\t%s\t%s","ID","Name     ","Salary       ","Age\n");
		try {
			//Since it's a static query hence statement used. In case of dynamic query we use the Prepared Statement
			Statement stmt=con.createStatement();
			stmt.executeQuery(query); //this executeQuery returns result set whatever result we are getting from this query
			ResultSet result=stmt.executeQuery(query);
			
			while(result.next()) { //as long as there is next result in the result set this loop will execute
				
				System.out.format("\n%d\t%S\t%f\t%d", result.getInt(1), 
						result.getString(2), 
						result.getDouble(3),
						result.getInt(4));
				System.out.println("\n-----------------------------------------------------");
			}
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	@Override
	public void showEmployeeBasedOnId(int id) {
		con=DBConnection.createDBConnection();
		String query="select * from EMPLOYEE where id="+id;
		System.out.println("Employee details of employee id="+id);
		System.out.println("-----------------------------------------------------");

		System.out.format("\n%S\t%S\t%s\t%s","ID","Name      ","Salary       ","Age\n");
		try {
			Statement stmt=con.createStatement();
			stmt.executeQuery(query);
			ResultSet result=stmt.executeQuery(query);
			
			while(result.next()) {
				System.out.format("\n%d\t%S\t%f\t%d", result.getInt(1), 
						result.getString(2), 
						result.getDouble(3),
						result.getInt(4));
				System.out.println("\n-----------------------------------------------------");
				
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		con=DBConnection.createDBConnection();
		String query="update EMPLOYEE set name=? where id=?";
		try {
			
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1,name);
			pstm.setInt(2, id);
			int count=pstm.executeUpdate();
			if(count!=0) {
				System.out.println("Employee name updated successfully!");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	@Override
	public void deleteEmployee(int id) {
		con=DBConnection.createDBConnection();
		String query="delete from EMPLOYEE where id=?";
		
		try {
			
			PreparedStatement pstm=con.prepareStatement(query); //pstm because again dynamic query
			pstm.setInt(1, id);
			int count=pstm.executeUpdate();
			if(count!=0) {
				System.out.println("Employee with id="+id+" deleted successfully!");
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
	}
	
	

}
