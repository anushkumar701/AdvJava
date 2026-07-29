package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpDemo")
public class httpServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		PrintWriter out=res.getWriter();
		out.print("<h1>Hi this is get method</h1>");
	}
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		PrintWriter out=res.getWriter();
		out.print("<h1>Hi this is Post method</h1>");
	}
}
