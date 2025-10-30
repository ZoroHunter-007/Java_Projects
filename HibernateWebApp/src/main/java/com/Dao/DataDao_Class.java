package com.Dao;



import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Model.Account;
import com.Model.Register_Cust;
import com.util.Session_Class;

public class DataDao_Class {

	Session s = null;
    Transaction t = null;
    public void InsertData(Register_Cust rc) {

        Session s = Session_Class.getSession();
        Transaction t = s.beginTransaction();

        Account ac = new Account();
        ac.setHolder_name(rc.getFullname()); // auto set account holder name

        rc.setAcc(ac); // attach account to customer

        s.persist(rc);

        t.commit();
        s.close();
    }

    
    public Register_Cust checkLogin(String email, String password) {
        Session s = null;
        Register_Cust rc = null;

        try {
            s = Session_Class.getSession();

            String hql = "from Register_Cust r where r.email = :email and r.password = :password";
            rc = s.createQuery(hql, Register_Cust.class)
                    .setParameter("email", email)
                    .setParameter("password", password)
                    .uniqueResult();  // returns user object or null

            if (rc != null && rc.getAcc() != null) {
                // Force Hibernate to fetch account details (avoid lazy issues)
                rc.getAcc().getAc_no();
                rc.getAcc().getBalance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (s != null) s.close();
        }

        return rc;
    }

    
    public void InsertAcccount(Account a) {
        
  	  s = Session_Class.getSession();
        t = s.beginTransaction();
        s.persist(a);
        t.commit();
        s.close();
  }
  


}
