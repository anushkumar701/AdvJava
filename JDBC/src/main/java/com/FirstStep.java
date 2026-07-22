package com;
//Load or Register Driver

import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstStep {
    public static void main(String[] args) {
        try {
            java.sql.Driver d = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(d);
            System.out.println("Success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
