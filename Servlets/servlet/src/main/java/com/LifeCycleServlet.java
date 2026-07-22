package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life")
public class LifeCycleServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response)throws IOException, ServletException{
		System.out.println("Hi this is Service method");
	}
	
	@Override
	public void init() {
		System.out.println("Hi this is init method");
	}
	@Override
	public void destroy() {
		System.out.println("Hi this is destroy method");
	}
}