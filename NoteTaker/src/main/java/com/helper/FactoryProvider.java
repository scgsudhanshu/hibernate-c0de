package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	public static SessionFactory factory;
	
	public static SessionFactory getFactory() 
	{
		if(factory == null)
		{
			System.out.println("-------------------Factory is Null ------------------");	
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public void closeFactory()
	{
		if(factory.isOpen())
		{
			System.out.println("Closing the factory --------------------->");
			factory.close();
		}
	}
}
