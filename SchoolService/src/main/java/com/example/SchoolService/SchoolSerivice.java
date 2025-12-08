package com.example.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolSerivice {

	@Autowired 
	private SchoolRepositary schoolRepositary;
	
	public School addStudents(School school) {
		return schoolRepositary.saveAndFlush(school);
	}
}
