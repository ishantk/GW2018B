package com.auribises.model;

// Model or Bean or POJO(Plain Old Java Object)
public class User {
	
	public int uid;
	public String name;
	public String email;
	public String password;
	
	public User() {
	
	}

	public User(int uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
