package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookies")
public class GetCookies extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServerException{
		
		Cookie arr[] = req.getCookies();
		
		PrintWriter out = res.getWriter();
		
		for(Cookie c : arr) {
			out.print("<h1>" + c.getName() + "-" + c.getValue()+ "</h1>");
		}
 		
	}
}