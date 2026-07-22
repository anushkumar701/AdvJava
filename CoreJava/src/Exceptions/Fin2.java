package Exceptions;

public class Fin2 {
    static void main(String[] args) {
        System.out.println("Start");
        try {
            String s = "Ten";
        } catch (NumberFormatException e) {
            System.out.println("Handles");
        } finally {
            System.out.println("Finally Block-1");
        }
        System.out.println("*********");
        try {
            System.out.println(4 / 2);
        } catch (Exception e) {
            System.out.println("Handled");
        } finally {
            System.out.println("Finally Block 2");
        }
        System.out.println("End");
    }
}
