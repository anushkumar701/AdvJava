package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Login")
public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		if(email.equals("kratos@gmail.com")) {
			if(password.equals("123")) {
				RequestDispatcher dispatcher=req.getRequestDispatcher("home.html");
				dispatcher.forward(req, res);
			}
			else {
				out.print("<h1> Invalid Password</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				dispatcher.include(req, res);
			}
		}
		else {
			out.print("<h1> Invalid Email");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
			dispatcher.include(req, res);
			
		}
	}

}
