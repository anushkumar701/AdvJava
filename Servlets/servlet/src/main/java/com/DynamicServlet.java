package com;

import java.io.*;
import java.net.ResponseCache;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.util.*;

@WebServlet("/dynamic")
public class DynamicServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		Date d=new Date();
		String html="<html>"+
		"<body>"+
		"<h1>"+d+"</h1>"+
		"</body>"+
		"</html>";
		
		PrintWriter outPrint=res.getWriter();
		outPrint.print(html);
		
	}
}
