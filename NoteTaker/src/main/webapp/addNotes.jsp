<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="jss_css.jsp" %>	
</head>
<body>
	<div class="container">	
	<%@include file="Navbar.jsp" %>
	<br>
	<h1>This is the Add Notes Page</h1>
	
	<!-- Form designing -->
	
	<form action = "SaveNoteServlet" method="post">
  <div class="mb-3">
    <label for="Notetitle" class="form-label">Title</label>
    <input type="text" name = "title" class="form-control" id="Notetitle" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-3">
    <label for="Content" class="form-label">Content</label>
    <textarea id="Content" name = "content" class="form-control" style="height:300px;"></textarea>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
	</div>
</body>
</html>