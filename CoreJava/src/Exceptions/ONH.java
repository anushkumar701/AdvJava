package Exceptions;

public class ONH {//occurs not handled

    static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(5 / 0);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End");

    }
}
