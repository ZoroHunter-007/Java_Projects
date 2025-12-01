package com.example.MySpringBootProject;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v2/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/Student")
	public ResponseEntity<Student>InsertStudent(@RequestBody Student stud){
		Student student=studentService.InsertData(stud);
		return  ResponseEntity.ok(student);
	}
	
	@PostMapping("/Students")
	public ResponseEntity<List<Student>>InsertDataMul(@RequestBody List<Student> stud){
		List<Student> student=studentService.InsertMulData(stud);
		return ResponseEntity.ok(student);
	}
	
	@GetMapping("/Student")
	public ResponseEntity<List<Student>>FetchAllStudent(){
		return ResponseEntity.ok(studentService.FecthAllData());
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student>FecthStudnetById(@PathVariable int id){
		Student studRrpo=studentService.FecthById(id);
		if(studRrpo!=null) {
			return ResponseEntity.ok(studRrpo);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Student>DeleteStudentById(@PathVariable int id){
		studentService.DeleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/Student/{id}")
	public ResponseEntity<Student>UpdateStudentData(@PathVariable int id, @RequestBody Student stud){
		Student student=studentService.UpdateData(id, stud);
		if(student!=null) {
			return ResponseEntity.ok(student);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<String>CheckLogin(@RequestBody Student stud){
		String result=studentService.CheckLogin(stud.getStudName(), stud.getStudPass());
		
		if(result.equalsIgnoreCase("SUCCESS")) {
			return ResponseEntity.ok("Login Successfully..");
		}
		else if(result.equalsIgnoreCase("INVALID_PASSWORD")) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect Password!");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Found");
		}
	}
}
