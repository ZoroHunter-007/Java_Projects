package com.DataConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataConnection {

	Session s;
	public Session getSession() {
		
		Configuration cfgr=new Configuration();
		cfgr.configure();
		
		
		SessionFactory sf=cfgr.buildSessionFactory();
		s=sf.openSession();
		
		return s;
	}
}
