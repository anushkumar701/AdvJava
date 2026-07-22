package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetch")
public class FetchServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		PrintWriter out=res.getWriter();
		out.print("<h1>ID =" + id + "</h1>");
		out.print("<h1>Name=" + name + "</h1>");
	}
}
	