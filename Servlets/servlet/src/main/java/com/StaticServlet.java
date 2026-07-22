package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/static")
public class StaticServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		String html="<html>"
				+"<body>"
				+"<h1>This is Static Servlet</h1>"
				+"<body>"
				+"<html>";
		PrintWriter out=res.getWriter();
		out.print(html);
		
	}
}
