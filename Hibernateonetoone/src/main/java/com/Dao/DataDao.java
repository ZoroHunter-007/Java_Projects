package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.Dbutil;

public class DataDao {

	Session s;
	Transaction tx;
	
	Dbutil db=new Dbutil();
	
	public void  SaveData(Student s1) {
		s=db.gSession();
		tx=s.beginTransaction();
		s.save(s1);
		tx.commit();
		s.close();
		System.out.println("Data Saved Successfully....");
	}
}
