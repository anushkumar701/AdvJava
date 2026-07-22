package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection c = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        System.out.println("Enter Timing:");
        String timing = sc.next();
        System.out.println("Enter Rating:");
        double rating = sc.nextDouble();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");
            PreparedStatement ps = c.prepareStatement("update cartoon set timing=?,rating=? where id=?");
            ps.setString(1, timing);
            ps.setDouble(2, rating);
            ps.setInt(3, id);
            ps.execute();
            System.out.println("Done!!");
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
