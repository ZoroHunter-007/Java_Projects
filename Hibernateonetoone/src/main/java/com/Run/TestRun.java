package com.Run;

import com.Dao.DataDao;
import com.model.Student;
import com.model.Subject;

public class TestRun {

	public static void main(String[] args) {
		
		Subject s=new Subject();
		s.setSub_id(106);
		s.setSub_name("Java");
		System.out.println("Subject Details:"+s);
		
		Student st=new Student();
		st.setRollno(87);
		st.setStd_name("pqr");
		st.setStd_email("pqr@gmail.com");
		st.setSubject(s);
		
		DataDao d=new DataDao();
		d.SaveData(st);
		System.out.println("Student Details:"+st);
		
	}
}
