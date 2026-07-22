package com;


import java.sql.*;

public class Fetch {

    public static void main(String[] args) {
        Connection c=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");


            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM cartoon");

            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getDouble("rating"));
                System.out.println(rs.getString("language"));
                System.out.println("----------------------------------------");
            }

            rs.close();
            s.close();
            c.close();

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