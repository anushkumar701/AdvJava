package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ThirdStep {
    public static void main(String[] args) {
        Connection c=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cartoon_db",
                    "root",
                    "kratos");

            Statement s = c.createStatement();

            s.executeUpdate(
                    "INSERT INTO cartoon VALUES " +
                            "(6,'Ben 10','CN','11:00 AM',4.9,'Tamil')," +
                            "(7,'Doraemon','Disney','9:00 AM',4.8,'Hindi')," +
                            "(8,'Tom and Jerry','Pogo','10:30 AM',4.7,'English')," +
                            "(9,'Jackie Chan','Pogo','11:30 AM',4.9,'Tamil')"
            );

            System.out.println("Data Inserted....!");

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