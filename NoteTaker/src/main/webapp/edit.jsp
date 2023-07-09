<%@page import ="com.entities.*" %>
<%@page import = "org.hibernate.Session" %>
<%@page import = "org.hibernate.query.Query" %>
<%@page import = "java.util.*" %>>
<%@page import ="com.helper.FactoryProvider" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Note</title>
<%@include file="jss_css.jsp" %>
</head>
<body>
	 <div class="container">
    	<%@include file="Navbar.jsp" %>
    	<h1>Update Your Note</h1>
    	<%
    	//Java code to fetch the data
    	int id = Integer.parseInt(request.getParameter("note_id"));
    	System.out.println("Updating Request ............ > "+id);
    	Session s = FactoryProvider.getFactory().openSession();
    	Note note = (Note) s.get(Note.class,id); 
    	System.out.println("Note Title ->"+note.getTitle());
    	System.out.println("Note Content ->"+note.getContent());
    	s.close();
    	
    	%>
    	<form action = "UpdateServlet" method="post">
		  <div class="mb-3">
		    
		    <input name="note_id" value="<%=note.getId() %>" type="hidden" />
		    
		    <label for="Notetitle" class="form-label">Title</label>
		    <input type="text" 
		    name = "title" 
		    class="form-control" 
		    id="Notetitle" 
		    aria-describedby="emailHelp"
		    value="<%=note.getTitle() %>">
		    
		  </div>
		  <div class="mb-3">
		    <label for="Content" class="form-label">Content</label>
		    <textarea id="Content" 
		    name = "content" 
		    class="form-control"
		     
		    style="height:300px;"><%=note.getContent() %></textarea>
		  </div>
		  
		  <button type="submit" class="btn btn-primary">Update Your Note</button>
		</form>
    </div>
</body>
</html>