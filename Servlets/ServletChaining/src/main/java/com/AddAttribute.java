package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAttribute")
public class AddAttribute extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		Student s = new Student(1, "tom", 36.2);
		ServletContext context = getServletContext();
		context.setAttribute("std", s);

		PrintWriter out = res.getWriter();
		out.print("<h1>Attributes added</h1>");
	}
}