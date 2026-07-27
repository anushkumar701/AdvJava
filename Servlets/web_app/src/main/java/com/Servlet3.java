package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/s3",initParams= {
		@WebInitParam(name="email",value = "jerry@gmail.com"),
		@WebInitParam(name="password",value = "123"),}
)

public class Servlet3 extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		ServletConfig config=getServletConfig();
		String email=config.getInitParameter("email");
		String password=config.getInitParameter("password");
		PrintWriter out=res.getWriter();
		out.print("<h1> Email = " + email +"</h1>");
		out.print("<h1> +Password = " + password + "</h1>");
	}
	
}
