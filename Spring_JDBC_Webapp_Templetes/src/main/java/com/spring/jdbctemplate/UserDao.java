package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {

	//insert the data
	void register(User user);
	
	//Show All Data
	List<User> getallUsers();
	
	
}
