package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Model.Employee;
import com.util.Dbcon;

public class DaoClass {

	Session s;
	Transaction tx;
	Dbcon db=new Dbcon();
	public void SaveData(Employee e) {
		s=db.gSession();
		tx=s.beginTransaction();
		s.save(e);
		tx.commit();
		s.close();
	}
}
