package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondStep {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");
            Statement s = c.createStatement();
            s.executeUpdate("insert into cartoon values(2,'Ben-10 Alien Force','Cartoon Network','06.00 PM',5,'Tamil')");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                c.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}