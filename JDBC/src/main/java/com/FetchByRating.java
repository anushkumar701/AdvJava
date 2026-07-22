package com;

import java.sql.*;

public class FetchByRating {

    public static void main(String[] args) {
        Connection c=null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos"
            );


            PreparedStatement ps = c.prepareStatement(
                    "SELECT id, name, language, rating FROM cartoon ORDER BY rating DESC"
            );


            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                System.out.println("ID = " + rs.getInt("id"));
                System.out.println("Name = " + rs.getString("name"));
                System.out.println("Language = " + rs.getString("language"));
                System.out.println("Rating = " + rs.getDouble("rating"));
                System.out.println("--------------------------------");
            }


            rs.close();
            ps.close();
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