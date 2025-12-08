package com.example.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/schools")
public class SchoolController {

	@Autowired
	private SchoolSerivice schoolSerivice;
	
	@PostMapping("/add")
	public ResponseEntity<School>addSchool(@RequestBody School school){
		System.out.println(">>> Received: " + school);
		School sc=schoolSerivice.addStudents(school);
		return ResponseEntity.ok(sc);
	}
}
