package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/s1")
public class Servlet1 extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		RequestDispatcher dispatcher=req.getRequestDispatcher("s2");
		dispatcher.forward(req, res);
	}2 vvvvvvvvvvv
}
