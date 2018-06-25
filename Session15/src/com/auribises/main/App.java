package com.auribises.main;

import com.auribises.view.RegisterUserSwingUI;

/*
 * Java GUI

	Model
		Holds the data
		Java Object, we write class to define structure of an 
		object

		User
			uid
			name
			email
			password
			.
			...

	View
		User Interface in Java
			java.awt
			javax.swing
			.
			..
			...

			Container
				Window
					Frame

				Panel	

			Component
				Label
				TextField
				Button
				RadioButton
				CheckBox
				ComboBox
				List
				Menu
				.
				..
				...

			Layout
				Arrangement how components shall be placed
				FlowLayout
				GridLayout
				BorderLayout
				.
				..
				...	


	Controller
		Have Business Logic
		
		1. Persist the data of an Object i.e. Model
			1. File
			2. Database
		2. Update -> DB
		3. Delete -> DB	 
		4. Fetch  -> DB
		5. Algos & some rules


		What is a DataBase ??
			RDBMS | Relational Database Management System
			Collection of Tables
			Table
				Rows & Columns
				Columns represents titles/attributes of an object
				Each Row in Table is called a Record	

		ORM -> Object Relational Mapping		

		// Java's Onject
		class User {
			int uid;
			String name;
			String email;
			String password;
		}

		Database -> MySQL/Oracle
		PL : SQL | Structured Query Language

		create table User(
			uid integer,
			name varchar(256),
			email varchar(256),
			password varchar(256)
		)

		insert into User values(null,'John','john@example.com','pass123')


		XAMPP
		MySQL

 */

public class App {

	public static void main(String[] args) {
		System.out.println("==App Started==");

//		User uRef = new User();
//		uRef.name = "John";
//		uRef.email = "john@example.com";
//		uRef.password = "pass123";
//		
//		System.out.println(uRef);
		
		//RegisterUserUI userUi = new RegisterUserUI();
		//userUi.showUI();
		
		RegisterUserSwingUI swingUi = new RegisterUserSwingUI();
		swingUi.showUI();
		
		
		System.out.println("==App Finished==");
	}

}
