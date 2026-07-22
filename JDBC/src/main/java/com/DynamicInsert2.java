package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Channel");
        String channel = sc.nextLine();

        System.out.println("Enter Timing");
        String timing = sc.nextLine();

        System.out.println("Enter Rating");
        double rating = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter Language");
        String language = sc.nextLine();
        Connection c = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos");

            PreparedStatement ps = c.prepareStatement(
                    "INSERT INTO cartoon VALUES(?,?,?,?,?,?)");

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, channel);
            ps.setString(4, timing);
            ps.setDouble(5, rating);
            ps.setString(6, language);

            ps.executeUpdate();

            System.out.println("Data Inserted Successfully!");

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