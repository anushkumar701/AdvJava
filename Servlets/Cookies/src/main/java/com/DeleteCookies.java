package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookies")
public class DeleteCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		Cookie c1 = new Cookie("email", "");
		Cookie c2 = new Cookie("password", "");

		c1.setMaxAge(0);
		c2.setMaxAge(0);

		res.addCookie(c1);
		res.addCookie(c2);

		PrintWriter out = res.getWriter();
		out.print("<h1>Cookies Deleted</h1>");
	}
}