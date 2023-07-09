package com.hibernate.hibernateORM2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

	public static void main(String args[])
	{
		
		System.out.println("Second Level Cache ........");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Voter voter = (Voter) session1.get(Voter.class,"VOTVIV");
		
		System.out.println("voter id -> "+voter.getId()+" voter name -> "+voter.getFirstname());
		
		session1.close();
		
		Session session2 = factory.openSession();
		
		Voter voter2 = (Voter) session2.get(Voter.class,"VOTVIV");
		
		System.out.println("voter id -> "+voter2.getId()+" voter name -> "+voter2.getFirstname());
		
		session2.close();
		factory.close();
	}
}
