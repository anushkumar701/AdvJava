package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/create1")
public class SignupServlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		String phone= req.getParameter("phone");
		
		PrintWriter out=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","kratos");
			PreparedStatement ps= c.prepareStatement("insert into user values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setLong(4, Long.parseLong(phone));
			ps.executeUpdate();
			c.close();
			
			out.print("<h1>Data Saved</h1>");
			
		}
		catch(ClassNotFoundException | SQLException e){
			out.print("<h1>"+e+"</h1>");
			e.printStackTrace();
		}
	}

}