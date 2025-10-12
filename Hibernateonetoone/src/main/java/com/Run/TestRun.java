package com.Run;

import com.Dao.DataDao;
import com.model.Student;
import com.model.Subject;

public class TestRun {

	public static void main(String[] args) {
		
		Subject s=new Subject();
		s.setSub_id(108);
		s.setSub_name("C++");
		System.out.println("Subject Details:"+s);
		
		Student st=new Student();
		st.setRollno(98);
		st.setStd_name("pqrs");
		st.setStd_email("pqrs12@gmail.com");
		st.setSubject(s);
		
		DataDao d=new DataDao();
		d.SaveData(st);
		System.out.println("Student Details:"+st);
		
	}
}
