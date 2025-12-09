package com.example.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudnetService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<?>CreateStudent(Student stud){
		try {
			return new ResponseEntity<Student>(studentRepo.save(stud),HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
