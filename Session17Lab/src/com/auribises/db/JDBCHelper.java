package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.auribises.model.Customer;

public class JDBCHelper {
	
	Connection con;
	PreparedStatement pStmt;

	public JDBCHelper() {
		
		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	public void createConnection(){
		try {
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2018B";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Created==");
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	// deleteCustomer(int cid) | updateCustomer(Customer cRef)
	public int addCustomer(Customer cRef){
		
		int i = 0;
		
		try {
			
			//3. Write SQL Statement
			String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, cRef.name);
			pStmt.setString(2, cRef.email);
			pStmt.setString(3, cRef.phone);
			pStmt.setInt(4, cRef.age);
			
			i = pStmt.executeUpdate(); // Execute SQL Statement (insert/update/delete)
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return i;
	}
	
	public ArrayList<Customer> queryCustomers(){
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			String sql = "select * from Customer";
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery(); // Retrieve
			
			while(rs.next()){
				
				Customer cRef = new Customer();
				cRef.cid = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				cRef.age = rs.getInt(5);
				
				//System.out.println(cRef);
				
				customers.add(cRef);
				
			}	
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
			e.printStackTrace();
		}
		
		return customers;
	}
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println("==Connection Closed==");
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
}
