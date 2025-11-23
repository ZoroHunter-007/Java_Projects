package com.spring.jdbc.templates;

import java.util.List;

public interface UserService {

	//insert data
	void InsertData(Student stud);
	
	//show data
	List<Student>showAllData();
	
}
