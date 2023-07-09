package com.hibernate.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String args[])
	{
		System.out.println("Mapping through XML ................");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Provider provider = new Provider();
		provider.setProviderName("Pawan Kumar");
		provider.setProviderType("Doctor");
		
		Provider provider2 = new Provider();
		provider2.setProviderName("Jaypee Hospital");
		provider2.setProviderType("Hospital");
		
		Provider provider3 = new Provider();
		provider3.setProviderName("Mohalla Clinic-2");
		provider3.setProviderType("Clinic");
		
		Transaction tx = session.beginTransaction();
		session.save(provider);
		session.save(provider2);
		session.save(provider3);
		tx.commit();
		session.close();
	}
}
