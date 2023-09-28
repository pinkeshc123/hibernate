package com.hibernat.hibernat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)throws IOException {
		System.out.println("Project started");

		SessionFactory factory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();

		System.out.println(factory);

		student st = new student();

		st.setId(1015);
		st.setName("Pinkesh");
		st.setCity("delhi");

		System.out.println(st);
		
		
		
		Address ad=new Address();
		
		ad.setStreet("street1");
		ad.setCity("ratlam");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1462.66);
		
		FileInputStream fis=new FileInputStream("src/main/java/my sign.jpg");
		
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

		Session session = factory.openSession();

		session.beginTransaction();

		session.save(st);
		session.save(ad);

		session.getTransaction().commit();

		session.close();

	}

}
