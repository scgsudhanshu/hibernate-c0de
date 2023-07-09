package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Note;


/**
 * Servlet implementation class SaveNoteServlet
 */
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    
    public SaveNoteServlet() {
        super();
       
          
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			System.out.println("Post Method Called : -------->");		
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			System.out.println("Title -> "+title +" content -> "+content);
			Note note = new Note(title,content,new Date());
			
			System.out.println("Note Id :"+note.getId()+" Note Title :"+note.getTitle()+" Note Content :"+note.getContent()+" Date :"+note.getUpdateddate());
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
		
			session.save(note);
			tx.commit();
			session.close();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<h1 style='text-align:center;'>Data has been added successfully</h1>");
			out.println("<h1 style = 'text-align:center'><a href ='all_notes.jsp'>View All notes </a></h1>");
		
		}
		catch(Exception e)
		{
			System.out.println("Exception >>>>>>>> "+e);
		}
		//doGet(request, response);
	}

}
