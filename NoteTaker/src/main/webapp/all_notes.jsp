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
<title>View All Notes</title>
<%@include file="jss_css.jsp" %>
</head>
<body onload="loading_body()">
	
	<div class="container">
    	<%@include file="Navbar.jsp" %>
    	<br />
    	
    	<h1 class="text-uppercase">All Notes</h1>
    	<% 
    	
    	// Executing Java Code
    	
    	Session s = FactoryProvider.getFactory().openSession();
    	Query q = s.createQuery("from Note");
    	List<Note> list = q.list();
    	
    	for(Note note : list)
    	{
    		%>
    		<div class="card mt-3">
  			<img class="card-img-top " style="max-width:100px;" src="images/post-it.png" alt="Card image cap">
  			<div class="card-body px-5">
    			<h5 class="card-title"><%= note.getTitle() %></h5>
    			<p class="card-text"><%=  note.getContent() %></p>
    			<a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger">Delete</a>
    			<a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
  			</div>
			</div>
    		<% 
    		
    	}
    	%>
    	
    </div>
    
    
	
</body>
</html>