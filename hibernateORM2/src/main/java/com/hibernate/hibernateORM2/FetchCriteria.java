package com.hibernate.hibernateORM2;




import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchCriteria {

	public static void main(String args[])
	{
		System.out.println("Fetch usig Criteria .........");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Voter.class);
		
		List<Voter> voters = criteria.list();
		
		for(Voter voter : voters)
		{
			System.out.println("Voter ->"+voter);
		}
		
		session.close();
	}
}
