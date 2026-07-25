package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/find")
public class FindByIdServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {

		String email = req.getParameter("email");
		PrintWriter out = res.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/user_db",
					"root",
					"kratos");

			PreparedStatement ps = connection.prepareStatement(
					"select * from user where email = ?");

			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				out.println("<h1>Name = " + rs.getString(1) + "</h1>");
				out.println("<h1>Email = " + rs.getString(2) + "</h1>");
				out.println("<h1>Password = " + rs.getString(3) + "</h1>");
				out.println("<h1>Phone = " + rs.getString(4) + "</h1>");
			} else {
				out.println("<h1>Data Not Found</h1>");
			}

		} catch (ClassNotFoundException | SQLException e) {
			out.println("<h1>" + e + "</h1>");
			e.printStackTrace();
		}
	}
}