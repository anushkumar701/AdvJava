package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addCookies")
public class AddCookies extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException,ServletException{
		//create a cookies
		Cookie c1=new Cookie("email", "tom@gmail.com");
		Cookie c2=new Cookie("password", "123");
		//store the cookies
		res.addCookie(c1);
		res.addCookie(c2);
		PrintWriter out=res.getWriter();
	    out.print("<h1>Added Cookies</h1>");
	}
}
