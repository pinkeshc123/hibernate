package com.hibernat.hibernat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class emDemo {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		
		student st=new student();
		st.setId(252);
		st.setName("chouhan");
		st.setCity("indore");
		
		Certificate ce=new Certificate();
		ce.setCourse("android");
		ce.setDuration("1 month");
		
		st.setCerti(ce);
		
		
		
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(st);
		
		
		tx.commit();
		
		
		session.close();
		factory.close();
	}

}
