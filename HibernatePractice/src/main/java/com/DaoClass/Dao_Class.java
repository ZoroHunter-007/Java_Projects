package com.DaoClass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.DataConnection.DataConnection;
import com.TestHibernate.Bank;

public class Dao_Class {

	Session ss;
	Transaction tx;
	
	DataConnection dc=new DataConnection();
	public void InsertData(Bank b) {
		
		ss=dc.getSession();
		tx=ss.beginTransaction();
		ss.save(b);
		tx.commit();
		ss.close();
	}
	
	public void UpdateData(Bank b) {
	
		ss=dc.getSession();
		tx=ss.beginTransaction();
		ss.update(b);
		tx.commit();
		ss.close();
	}
	
	public void DeleteData(Bank b) {
		ss=dc.getSession();
		tx=ss.beginTransaction();
		ss.delete(b);
		tx.commit();
		ss.close();
		
		
	}
	public Bank FetchDataByAc_number(int ac_number) {
		ss=dc.getSession();
		Bank b=(Bank) ss.get(Bank.class, ac_number);
		
		return b;
	}
	
	public List<Bank>ShowAllData(){
		ss=dc.getSession();
		List<Bank>list=ss.createQuery("from Bank").list();
		return list;
	}
	
	public void SaveData() {
		
	}
}
