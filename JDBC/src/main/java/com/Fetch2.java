package com;

import java.sql.*;

public class Fetch2 {

    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos"
            );

            Statement stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT name, rating, language FROM cartoon"
            );

            System.out.println("Name\t\tRating\tLanguage");
            System.out.println("-----------------------------------");

            while (rs.next()) {
                String name = rs.getString("name");
                double rating = rs.getDouble("rating");
                String language = rs.getString("language");

                System.out.println(name + "\t\t" + rating + "\t" + language);
            }

            rs.close();
            stmt.close();
            con.close();

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