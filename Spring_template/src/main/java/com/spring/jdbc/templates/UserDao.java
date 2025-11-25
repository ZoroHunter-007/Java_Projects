package com.spring.jdbc.templates;

import java.util.List;

public interface UserDao {

	//insert data
	void InsertData(Student stud);
	
	//show all data
	List<Student>showAllData();
	
	//display data by ID
		Student StudentById(int id);
		
	//update Student 
	void UpdateData(Student stud);
	
	//delete Student
	void DeleteData(int id);
	
}
