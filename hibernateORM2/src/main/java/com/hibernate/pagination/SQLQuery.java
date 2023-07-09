package com.hibernate.pagination;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SQLQuery {

	public static void main(String args[])
	{
		System.out.println("Executing Native SQL Query ...........");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query = "select * from tbl_employee";
		
		Query q = session.createSQLQuery(query);
		
		List<Object[]> result = q.getResultList();
		
		for(Object[] employee : result)
		{
			System.out.println("Employee Id -> "+employee[0]+" Employee Dept -> "+employee[1]+" Employee Name -> "+employee[2]);
		}
		
	}
}
