package Exceptions;

public class NPE {//NullPointerException

    static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
            System.out.println("Hi");
        } catch (NullPointerException e) {
            System.out.println("Handled");//Executed
        }
        System.out.println("End");
    }
}
