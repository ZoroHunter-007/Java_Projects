package com.DataDao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.Connection;

public class DataDao {

	Session s;
	Transaction tx;
	
	Connection con=new Connection();
	
	public void SaveData(Student stud) {
		s=con.getSession();
		tx=s.beginTransaction();
		s.save(stud);
		tx.commit();
		s.close();
	}
}
