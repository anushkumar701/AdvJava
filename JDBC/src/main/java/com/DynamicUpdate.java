package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID");
        int idx = sc.nextInt();

        System.out.println("Enter Timing");
        String timingx = sc.next();

        System.out.println("Enter Rating");
        double ratingx = sc.nextDouble();
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos");

            PreparedStatement ps = c.prepareStatement(
                    "UPDATE cartoon SET timing=?, rating=? WHERE id=?");

            ps.setString(1, timingx);
            ps.setDouble(2, ratingx);
            ps.setInt(3, idx);

            ps.executeUpdate();

            System.out.println("Data updated through dynamic");

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