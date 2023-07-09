package com.hibernate.hibernateORM2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		System.out.println("Fetching Data ............");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = null;
		try
		{
			 session = factory.openSession();
		}
		catch(Exception e)
		{
			System.out.println("Exception >>>>>>>>>>>>>>>>>>"+e);
		}
		//Voter voter = (Voter) session.get(Voter.class, "VOTAP01");
		Voter voter = (Voter) session.get(Voter.class, "VOTAM");
		System.out.println("Voter id -> "+voter.getId());
		System.out.println("Voter id -> "+voter.getFirstname()+" "+voter.getMiddlename()+" "+voter.getLastname());
		
		System.out.println("Checking for Firts Level caching Working Something .............");
		
		Voter voter2 = (Voter) session.get(Voter.class, "VOTAM");
		System.out.println("Voter id -> "+voter2.getId());
		System.out.println("Voter id -> "+voter2.getFirstname()+" "+voter2.getMiddlename()+" "+voter2.getLastname());
		
		
		session.close();
		//factory.close();
	}
}
