package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Transaction;

import org.hibernate.Session;

import com.entities.Note;
import com.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			System.out.println("Deleting Note ............");
			int id = Integer.parseInt(request.getParameter("note_id").trim());
			System.out.println("Id : -> "+id);
			
			Session session = FactoryProvider.getFactory().openSession();
			
			Note note = (Note) session.get(Note.class, id);
			Transaction tx = session.beginTransaction();
			session.delete(note);
			tx.commit();
			session.close();
			response.sendRedirect("all_notes.jsp");
		}
		catch(Exception e)
		{
			System.out.println("Exception >>>>>>>>> "+e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
