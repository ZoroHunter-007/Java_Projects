package com.example.MySpringBootProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService  {

	@Autowired
	 private StudentRepositary studentRepositary;


	@Autowired
	private BCryptPasswordEncoder encoder;
	//insert data
	public Student InsertData(Student stud) {
		String encryptedPass=encoder.encode(stud.getStudPass());
		stud.setStudPass(encryptedPass);
		return studentRepositary.saveAndFlush(stud) ;
	}
	
	//multiple data
	public List<Student>InsertMulData(List<Student> stud){
		return studentRepositary.saveAll(stud);
		
	}
	// fetch all data
	
	public List<Student> FecthAllData(){
		return studentRepositary.findAll();
	}
	
	//fetch by Id
	public Student FecthById(int id) {
		return studentRepositary.findById(id).orElse(null);
	}
	
	//delete by Id
	public void DeleteById(int id) {
		studentRepositary.deleteById(id);
	}
	
	//update Student 
	public Student UpdateData(int id, Student stud) {
		Student student=studentRepositary.findById(id).orElse(null);
		if(student!=null) {
			
			student.setStudName(stud.getStudName());
			student.setStudPass(stud.getStudPass());
			return studentRepositary.saveAndFlush(student);
		}
		else {
			return null;
		}
		
	}
	
	//check the login 
	public String CheckLogin(String studName, String studPass) {
		Student stud=studentRepositary.findBystudName(studName);
		
		if(stud==null)
		{
			return "USER_NOT_FOUND";
		}
		
		boolean match=encoder.matches(studPass, stud.getStudPass());
		
		if(match) {
			return "SUCCESS";
		}
		else {
			return "INVALID_PASSWORD";
		}
		
	}
	
}

