package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Model.Register_Cust;
import com.util.Session_Class;

public class DataDao_Class {

    public void InsertData(Register_Cust rc) {
        Session s = null;
        Transaction t = null;
        try {
            s = Session_Class.getSession();
            t = s.beginTransaction();
            s.persist(rc);
            t.commit();
        } catch (Exception e) {
            if (t != null) t.rollback();
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }
    }
}
