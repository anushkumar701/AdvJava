package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos");

            Statement s = c.createStatement();

            int rows = s.executeUpdate(
                    "DELETE FROM cartoon WHERE id = 2");

            System.out.println(rows + " row deleted.");

            s.close();
            c.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                c.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}