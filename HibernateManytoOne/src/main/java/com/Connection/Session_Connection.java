package com.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Session_Connection {

	Session s;
	
	public Session gSession() {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		s=sf.openSession();
		
		return s;
		
	}
}
