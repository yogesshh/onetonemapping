package com.scp.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneMapping {

	public static void main(String[] args) {
    
		Vehicle vehicle= new Vehicle(121, "BMW");
		
		UserDetails user= new UserDetails(151, "YOG", vehicle);
		
		SessionFactory sf= new Configuration().configure("hibernate.cfg2.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		tx.commit();
		session.close();
	}

}
