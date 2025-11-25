package com.spring.jdbctemplate;

import java.util.List;

public interface UserService {
	
	//insert data
	void register(User user);
	
	//show all data
	List<User>getallUser();
	
	//get data by UserId
	public User getUserById(int id);
	
	//update userData
		void UpdateUser(User user);
		
	//delete user by ID
		void DeleteUser(int id);
	
	
}
