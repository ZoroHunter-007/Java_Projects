package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Model.Register_Cust;
import com.util.Session_Class;

public class DataDao_Class {

	Session s = null;
    Transaction t = null;
    public void InsertData(Register_Cust rc) {
        
    	  s = Session_Class.getSession();
          t = s.beginTransaction();
          s.persist(rc);
          t.commit();
          s.close();
    }
    
    public List<Register_Cust> showData(String email, String password) {
        Session s = Session_Class.getSession();
        List<Register_Cust> list = s.createQuery(
            "FROM Register_Cust WHERE email = :email AND password = :password", Register_Cust.class)
            .setParameter("email", email)
            .setParameter("password", password)
            .list();
        s.close();
        return list;
    }

}
