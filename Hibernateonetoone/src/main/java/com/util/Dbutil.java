package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dbutil {

	Session s;
	public Session gSession() {
		//configuration class is used to configure hibernate
		//load hibernate.cfg.xml file
		Configuration con=new Configuration();
		con.configure();
		//session factory is used to create session object
		//build session factory method is used to create session factory object
		
		SessionFactory sf=con.buildSessionFactory();
		//open session method is used to create session object
		s=sf.openSession();
		
		return s;
	}
}
