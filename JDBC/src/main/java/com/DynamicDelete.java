package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDelete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter id");
        int id = sc.nextInt();

        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");

            PreparedStatement ps = c.prepareStatement("delete from cartoon where id = ? ");
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("data deleted through dynamic.......");


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