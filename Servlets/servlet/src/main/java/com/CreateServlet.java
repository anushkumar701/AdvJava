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
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
	
	}
}
