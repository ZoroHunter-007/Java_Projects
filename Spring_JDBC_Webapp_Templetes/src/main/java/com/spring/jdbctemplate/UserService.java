package com.spring.jdbctemplate;

import java.util.List;

public interface UserService {
	
	//insert data
	void register(User user);
	
	//show all data
	List<User>getallUser();
	
	
}
