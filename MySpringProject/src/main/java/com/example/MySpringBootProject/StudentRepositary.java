package com.example.MySpringBootProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends  JpaRepository<Student, Integer> {

	 public Student findBystudName(String studName);
	
	
}
