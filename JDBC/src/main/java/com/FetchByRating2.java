package com;

import java.sql.*;
import java.util.Scanner;

public class FetchByRating2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Value:");
        double st = sc.nextDouble();
        System.out.println("Enter Ending Value:");
        double end = sc.nextDouble();
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "kratos");
            PreparedStatement ps = c.prepareStatement("select * from cartoon where rating between ? and ?");
            ps.setDouble(1, st);
            ps.setDouble(2, end);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getDouble("rating"));
                System.out.println(rs.getString("Language"));
                System.out.println("--------------------------");
            }
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
