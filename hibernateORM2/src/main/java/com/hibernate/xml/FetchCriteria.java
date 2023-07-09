package com.hibernate.xml;




import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class FetchCriteria {

	public static void main(String args[])
	{
		System.out.println("Fetch usig Criteria .........");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Provider.class);
		
		criteria.add(Restrictions.eq("providerType", "Clinic"));
		
		
		List<Provider> voters = criteria.list();
		
		for(Provider voter : voters)
		{
			System.out.println("Voter ->"+voter);
		}
		
		session.close();
	}
}
