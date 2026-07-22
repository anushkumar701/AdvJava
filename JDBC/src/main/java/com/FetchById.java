package com;

import java.sql.*;
import java.util.Scanner;

public class FetchById {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos"
            );

            PreparedStatement ps = c.prepareStatement(
                    "select name, language from cartoon where id = ?"
            );

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Name = " + rs.getString(1));
                System.out.println("Language = " + rs.getString(2));
                System.out.println("--------------------------------");
            }

            rs.close();
            ps.close();
            c.close();
            sc.close();

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