package com.DataDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ModelClass.Customer;
import com.Util.DbSession;

public class Data_Dao {

	Session s;
	Transaction t;
	
	DbSession db=new DbSession();
	public void InsertData(Customer c) {
		s=db.gSession();
		t=s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
	}
	
	public void UpdateData(Customer c) {
		s=db.gSession();
		t=s.beginTransaction();
		s.update(c);
		t.commit();
		s.close();
	}
	
	public void DeleteData(Customer c) {
		s=db.gSession();
		t=s.beginTransaction();
		s.delete(c);
		t.commit();
		s.close();
	}
	
	public Customer FetchDatabyID(int id) {
		s=db.gSession();
		Customer c=(Customer) s.get(Customer.class, id);
		
		return c;
		
	}
	
	public List<Customer>ShowAllData(){
		s=db.gSession();
		List<Customer>list=s.createQuery("FROM Customer").list();
		return list;
		
	}
	public void ShowData(Customer c) {
		s=db.gSession();
		t=s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
		System.out.println("Data Save Successfully....");
	}
}
