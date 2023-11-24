//class for establishing connection with database oracle

package com.tulsi.empapp;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	//creating connection variable
	static Connection con;
	
	public static Connection createDBConnection() { //this static method is returning the connection i.e con
		
		
		try {
			
			//1. Loading driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Get connection
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="sys as sysdba";
			String password="welcome12#";
			con=DriverManager.getConnection(url,username,password);
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		return con;
		
	}
	

}
