<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <%
     String name= request.getParameter("name");
      out.print("name:"+ name);
  
      
  %> 
  <%
        session.setAttribute("user",name);
  %>
  <br>
  <a href="second.jsp">second jsp page</a>  
 
  <br>
  <h3><%="mehul" %></h3>
  
</body>
</html>