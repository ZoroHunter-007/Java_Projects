package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {

	//insert the data
	void register(User user);
	
	//Show All Data
	List<User> getallUsers();
	
	//get data by UserId
	public User getUserById(int id);
	
	//update userData
	void UpdateUser(User user);
	
	//delete user by ID
	void DeleteUser(int id);
	
}
