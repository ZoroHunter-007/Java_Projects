package com.RunFile;

import java.util.ArrayList;

import com.DataDao.DataDao;
import com.model.Course;
import com.model.Student;

public class Runprg {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setStud_name("Dhruv");
		s.setStud_rno(45);
		
		Student s1=new Student();
		s1.setStud_name("Dhruval");
		s1.setStud_rno(47);
		
		Student s2=new Student();
		s2.setStud_name("Jay");
		s2.setStud_rno(87);
		
		Student s3=new Student();
		s3.setStud_name("Alpit");
		s3.setStud_rno(5);
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		Course c=new Course();
		c.setCourse_name("Java FullStack Developer");
		
		Course c1=new Course();
		c1.setCourse_name("WordPress Developer");
		
		Course c2=new Course();
		c2.setCourse_name("Data Analysis");

		Course c3=new Course();
		c3.setCourse_name("M.ScIT");
		
		
		
		ArrayList<Course>alc=new ArrayList<Course>();
		alc.add(c);
		alc.add(c1);
		alc.add(c2);
		alc.add(c3);
		
		c.setStudents(al);
		c1.setStudents(al);
		c2.setStudents(al);
		c3.setStudents(al);
		
		s.setCourses(alc);
		s1.setCourses(alc);
		s2.setCourses(alc);
		s3.setCourses(alc);
	
	
		DataDao dao=new DataDao();
		dao.SaveData(s);
		dao.SaveData(s1);
		dao.SaveData(s2);
		dao.SaveData(s3);
	}
}
