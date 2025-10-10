package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


//POJO class or Entity class(Plain Old Java Object)
//POJO class is a simple java class that contains only fields, getters and setters and no business logic
//is used to represent a table in the database
//it is also known as Entity class
//it is used to map the table in the database to the class in the java application
//@Entity annotation is used to specify that the class is an entity and is mapped to a database table
//


@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String username;
	
	@Column
	private String password;
    
	@Column
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
