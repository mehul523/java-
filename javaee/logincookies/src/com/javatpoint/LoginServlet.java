package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response)  
             throws ServletException, IOException 
     {  
    	 
			response.setContentType("text/html");  
			PrintWriter out=response.getWriter();  
              //-->request dispacture -->
			request.getRequestDispatcher("link.html").include(request, response);  

		//	-->get the value from login  -->
		
		String name=request.getParameter("name");  
		String password=request.getParameter("password");
		
 //   -->condition
		
		if(password.equals("admin123"))
		{  
		out.print("You are successfully logged in!");  
		out.print("<br>Welcome, "+name);  
		//  --->cokie created -->
		Cookie ck=new Cookie("name",name);  
		response.addCookie(ck);  
		}
		else
		{  
		out.print("sorry, username or password error!");  
		request.getRequestDispatcher("login.html").include(request, response);  
		}  

out.close();  
}
}