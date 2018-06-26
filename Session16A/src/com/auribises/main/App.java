package com.auribises.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.auribises.model.Customer;


/*
 	JDBC(Java DataBase Connectivity) Procedure:

		1. Load the Driver
		   1.1 Download Type4 Driver i.e. jar file from Vendor's Distribution page
		   1.2 Configure the build path in Eclipse for your project
		   1.3 Load the Dirver using API -> Class.forname()

		2. Create the Connection of Java Program with DB   
			2.1 URL to the DB
			2.2 Username
			2.3 Password
			2.4 Use API Connection and DriverManager

		3. Write SQL Statement
			String sql = "insert into Customer values(null,'Sia','sia@example.com','+91 99999 77777',30)";

		4. Execute SQL Statement
			Use API's either Statement or PreparedStatement

		5. Close the Connection	
 */

public class App {

	public static void main(String[] args) {
		
		Customer cRef1 = new Customer(0,"John","john@example.com","+91 99999 88888",30);
		
		Customer cRef2 = new Customer();
		cRef2.cid = 2;
		cRef2.name = "Fionna";
		cRef2.email = "fionna@example.com";
		cRef2.phone = "+91 9879879876";
		cRef2.age = 28;
		
		System.out.println(cRef1);
		System.out.println(cRef2);

		// Even we have Objects holding the data, they are in RAM which is temp mem
		// We must persist the data of an object
		// 1. Serialization
		// 2. DataBase
		
		// JDBC Procedure
		
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pStmt = null;
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2018B";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Created==");
			
			//3. Write SQL Statement
			//String sql = "insert into Customer values(null,'Sia','sia@example.com','+91 99999 77777',30)";
			//String sql = "insert into Customer values(null,'"+cRef1.name+"','"+cRef1.email+"','"+cRef1.phone+"',"+cRef1.age+")";
			//String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			
			/*pStmt = con.prepareStatement(sql);
			pStmt.setString(1, cRef2.name);
			pStmt.setString(2, cRef2.email);
			pStmt.setString(3, cRef2.phone);
			pStmt.setInt(4, cRef2.age);*/
			
			//String sql = "update Customer set name = ?, email = ?, age = ? where cid = ?";
			String sql = "delete from Customer where cid = ?";
			pStmt = con.prepareStatement(sql);
			/*pStmt.setString(1, "John Watson");
			pStmt.setString(2, "john.wt@example.com");
			pStmt.setInt(3, 33);*/
			pStmt.setInt(1, 2);
			
			int i = pStmt.executeUpdate();
			
			if(i>0)
				System.out.println("==Delete Statement Executed==");
			else
				System.out.println("==Delete Statement Execution Failed==");
			
			//5. Close the Connection
			con.close();
			System.out.println("==Connection Closed==");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		
	}

}
