package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");
            Statement s = c.createStatement();
            s.executeUpdate("update cartoon set timing='7.00PM' where id=1");
            System.out.println("Updated Successfully");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
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