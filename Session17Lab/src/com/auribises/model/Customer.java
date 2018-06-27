package com.auribises.model;

public class Customer {
	
	public int cid;
	public String name;
	public String email;
	public String phone;
	public int age;
	
	public Customer() {
	
	}

	public Customer(int cid, String name, String email, String phone, int age) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}
}
