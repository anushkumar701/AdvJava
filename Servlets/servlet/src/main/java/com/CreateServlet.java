package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/create")
public class CreateServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req,ServletResponse res)throws IOException, ServletException{
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		String phone= req.getParameter("phone");
		
		PrintWriter out=res.getWriter();
		
		out.print("<h1> Name = "+name+"</h1>");
		out.print("<h1> Email = "+email+"</h1>");
		out.print("<h1> Password = "+password+"</h1>");
		out.print("<h1> Phone = "+phone+"</h1>");
	}
}