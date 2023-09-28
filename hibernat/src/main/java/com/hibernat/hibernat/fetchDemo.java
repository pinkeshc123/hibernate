package com.hibernat.hibernat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		student st=(student)session.get(student.class, 101);
//		student st=(student)session.load(student.class, 101);
		
		System.out.println(st);
		
		session.close();
		factory.close();
	}

}
