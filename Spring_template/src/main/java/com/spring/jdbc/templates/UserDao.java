package com.spring.jdbc.templates;

import java.util.List;

public interface UserDao {

	//insert data
	void InsertData(Student stud);
	
	//show all data
	List<Student>showAllData();
	
	
}
