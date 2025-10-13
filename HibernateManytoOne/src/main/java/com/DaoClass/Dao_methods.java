package com.DaoClass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Connection.Session_Connection;
import com.Model.Department;

public class Dao_methods {

	Session s;
	Transaction tx;
	
	Session_Connection sc=new Session_Connection();
	
	public void SaveDepartment(Department d) {
		
		s=sc.gSession();
		tx=s.beginTransaction();
		
		s.save(d);
		tx.commit();
		s.close();
	}
	
	public List<Department>ShowAllData(String dept_name){
		s=sc.gSession();
		List<Department>list=s.createQuery("from Department where dept_name='"+dept_name+"'").list();
		
		return list;
	}
	
	public Department FetchAllData(int dept_id){
		s=sc.gSession();
		Department d=(Department) s.get(Department.class,dept_id);
		
		return d;
		}
}
