package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		
		question q1=new question();
		q1.setQuestionId(1);
		q1.setQue("what is java");
		
		
		Answer a1=new Answer();
		a1.setAnswerId(11);
		a1.setAnswer("java is a programming language");
		
		q1.setAnswer(a1);
		
		Session s=factory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(q1);
		s.save(a1);
		
		
		tx.commit();
		s.close();
		factory.close();
	}

}
