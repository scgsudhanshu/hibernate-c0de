package com.hibernate.pagination;

import java.util.List;
import com.hibernate.manytomany.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLPagination {

	public static void main(String args[])
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "from Employee";
		Query q = session.createQuery(query);
		
		q.setFirstResult(5);
		
		q.setMaxResults(6);
		
		List<Employee> employees = q.getResultList();
		
		
		
		for(Employee employee : employees)
		{
			System.out.println("Id ->"+employee.getEmployeeId()+" Name ->"+employee.getEmployeeName()+" Dept ->"+employee.getEmployeeDept());
		}
		
		session.close();
		factory.close();
	}
}
