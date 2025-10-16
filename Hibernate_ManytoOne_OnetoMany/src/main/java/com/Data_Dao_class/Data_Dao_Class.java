package com.Data_Dao_class;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Model_Class.TransactionApp;
import com.Session.Session_class;

public class Data_Dao_Class {

	Session s;
	Transaction tx;
	Session_class sc=new Session_class();
	
	public void ShowData(TransactionApp tApp) {
		s=sc.GetSession();
		tx=s.beginTransaction();
		s.save(tApp);
		tx.commit();
		s.close();
	}
	
	public List<TransactionApp> FetchData(String T_Type) {
		
		s=sc.GetSession();
		List<TransactionApp>list=s.createQuery("FROM TransactionApp WHERE T_Type='"+T_Type+"'").list();
		return list;
		
	}
	
	public TransactionApp FecthDataById(int T_ID) {
		s=sc.GetSession();
		TransactionApp tApp=(TransactionApp) s.get(TransactionApp.class, T_ID);
		return tApp;
	}
}
