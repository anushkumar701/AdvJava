package com;

public class LoadTheDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
