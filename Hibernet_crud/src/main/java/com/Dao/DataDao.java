package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.Dbconn;
import com.model.User;

public class DataDao {

	Session session;
	Transaction t;
	Dbconn db=new Dbconn();
	
	//method for insert data
	public void InsertData(User u) {
		session=db.gSession();
		t=session.beginTransaction();
		session.save(u);
		t.commit();
		session.close();
	}
	
	//method for update data
	public void UpdateData(User u) {
		session=db.gSession();
		t=session.beginTransaction();
		session.update(u);
		t.commit();
		session.close();
	}
	
	//method for Delete Data
	public void DeleteData(User u) {
		session=db.gSession();
		t=session.beginTransaction();
		session.delete(u);
		t.commit();
		session.close();
	}
	
	//method for fetch data where id=?
	public User FetchData(int id) {
		session=db.gSession();
		User u=(User) session.get(User.class, id);
		
		return u;
	}
	public List<User> FetchAllData(){
		session=db.gSession();
		List<User>list=session.createQuery("FROM User").list();
		return list;
	}
}
