package Exceptions;

public class OH {//occurs hadled

    static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        }
        System.out.println("End");
    }
}
