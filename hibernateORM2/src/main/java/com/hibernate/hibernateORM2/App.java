package com.hibernate.hibernateORM2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        System.out.println("Creating hibernate Session");
        SessionFactory factory = null ; 
        try {
        	Configuration cfg = new Configuration();
            cfg.configure();
            factory = cfg.buildSessionFactory();
        }
        catch(Exception e)
        {
        	System.out.println("Exception>>>>>>>>>>>> "+e);
        }
       // SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println("Session Factory : "+factory);
        System.out.println("Is closed : "+factory.isClosed());
        
        /*
        Seat seat =new Seat();
        seat.setSeatName("Varanasi");
        seat.setState("U.P.");
        seat.setCurrent_MLA("Sudhanshu Gupta");
        seat.setCurrent_MP("Modi");
        */
        
        System.out.println("Here------->");
        Voter voter = new Voter();
        
        voter.setFirstname("Vivek");
        voter.setMiddlename("P.");
        voter.setLastname("Gupta");
        voter.setDOB(new Date("03/23/1979"));
        voter.setEmail("ankit.mudgal@gmail.com");
        voter.setPasswd("ANKIT");
        voter.setVoterid("VOTVIV");
        voter.setState("Delhi");
        voter.setStatecode("28");
        voter.setSeatname("Harsh Vihar");
        voter.setPhone("899882625516");
        
        FileInputStream fis = new FileInputStream("src/main/java/3.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        voter.setImage(data);
        //voter.setImage(null)
        
        Voter_Documents docs = new Voter_Documents();
        docs.setAadharNo("0987 3456");
        docs.setPassport("PASS12343#");
        docs.setTenthmarksheet("91666554");
        voter.setDocs(docs);
        Session session = factory.openSession();
        System.out.println("Session : -> "+session);
 
        Voter_Address addr = new Voter_Address();
        addr.setStreetNo("9");
        addr.setHouseNo("C13/789");
        addr.setCity("Mangalore");
        addr.setCountry("India");
        
        voter.setAddr(addr);
        
        Voter_Contact contact1 = new Voter_Contact();
        contact1.setEmail("viv1@gmail.com");
        contact1.setMobileNo("897674639238743");
        contact1.setVoter(voter);
        
        Voter_Contact contact2 = new Voter_Contact();
        contact2.setEmail("connectwithvivek@gmail.com");
        contact2.setMobileNo("282772373626");
        contact2.setVoter(voter);
        
        Voter_Contact contact3 = new Voter_Contact();
        contact3.setEmail("codewithvivek@gmail.com");
        contact3.setMobileNo("666662552552");
        contact3.setVoter(voter);
        
        List<Voter_Contact> contact_list=new ArrayList<Voter_Contact>();
        contact_list.add(contact1);
        contact_list.add(contact2);
        contact_list.add(contact3);
        
        voter.setContact(contact_list);
        
        Transaction tx = session.beginTransaction();
        session.save(voter);
        session.save(addr);
        //session.save(contact1);
        //session.save(contact2);
        //session.save(contact3);
        tx.commit();
        
        //Session session = factory.openSession();
        Voter voterget = (Voter) session.get(Voter.class,"VOTVPG");
        System.out.println("voter->"+voterget);
        session.close();
        
    }
}

