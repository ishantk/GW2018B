package com.auribises.model;

import java.io.Serializable;

// Model or Bean or POJO (Plain Old Java Object)
public class Student implements Serializable{

	// Attributes
	int roll;
	String name;
	transient String email; // will not be serialized
	int age;
	String address;
	
	public Student(){
		
	}
	
	public Student(int roll, String name, String email, int age, String address) {
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
				+ "]";
	}
	
}
