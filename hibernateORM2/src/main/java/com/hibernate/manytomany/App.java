package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	
	public static void main(String args[])
	{
		System.out.println("Started Hibernate ..............");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		/*
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Project pro1 = new Project();
		Project pro2 = new Project();
		Project pro3 = new Project();
		
		emp1.setEmployeeName("Konark");
		emp1.setEmployeeDept("Maps");
		
		
		emp2.setEmployeeName("Rajat");
		emp2.setEmployeeDept("Searching");
		
		emp3.setEmployeeName("Aditya");
		emp3.setEmployeeDept("Drive");
		
		emp4.setEmployeeName("Sudhanshu");
		emp4.setEmployeeDept("Management");
		
		pro1.setProjectName("Google Maps");
		pro2.setProjectName("Google Drive");
		pro3.setProjectName("Google Search");
		
		List<Employee> emp_list = new ArrayList<Employee>();	//list for employees
		List<Project> pro_list = new ArrayList<Project>();		//list for projects	
		
		
		
		pro_list.add(pro1);
		pro_list.add(pro3);
		
		emp1.setProject(pro_list);	// pro1 and 3 for konark
		System.out.println("Employee 1:"+emp1);
		pro_list.clear();
		pro_list.add(pro2);
		pro_list.add(pro3);
		emp2.setProject(pro_list);	//assigning project to rajat
		System.out.println("Employee 2:"+emp2);
		
		emp_list.add(emp3);		
		emp_list.add(emp4);
		
		pro1.setEmployee(emp_list);  //assigning to Aditya and Sudhanshu
		pro3.setEmployee(emp_list);
		System.out.println("Project 1:"+pro1);
		System.out.println("Project 3:"+pro3);
		emp_list.clear();
		emp_list.add(emp4);
		pro2.setEmployee(emp_list); //assigning project 2 to sudhanshu
		System.out.println("Project 2:"+pro2);
		
		*/
		
		Session session = factory.openSession();
		/*Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(pro1);
		session.save(pro2);
		session.save(pro3);
		
		tx.commit();
		*/
		Employee employee = (Employee) session.get(Employee.class, 4);
		System.out.println("Employee id -> "+employee.getEmployeeId());
		System.out.println("Employee Name ->"+employee.getEmployeeName());
		session.close();
	}
	
}
