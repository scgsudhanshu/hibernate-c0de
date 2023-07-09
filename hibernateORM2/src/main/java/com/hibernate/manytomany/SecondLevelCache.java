package com.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class SecondLevelCache {

	public static void main(String args[])
	{
		
		System.out.println("Second Level Cache ........");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Employee voter = (Employee) session1.get(Employee.class,9);
		
		System.out.println("voter id -> "+voter.getEmployeeId()+" voter name -> "+voter.getEmployeeName());
		
		session1.close();
		
		Session session2 = factory.openSession();
		
		Employee voter2 = (Employee) session2.get(Employee.class,9);
		
		System.out.println("voter id -> "+voter2.getEmployeeId()+" voter name -> "+voter2.getEmployeeName());
		
		session2.close();
		factory.close();
	}
}
