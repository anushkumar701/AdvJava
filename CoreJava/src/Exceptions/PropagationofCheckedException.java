package Exceptions;

public class PropagationofCheckedException {
    static void main(String[] args) {
        System.out.println("Start");
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    public static void m1() {
        System.out.println("M1 Start");
        m2();
        System.out.println("M1 End");
    }

    public static void m2() {
        System.out.println("M2 Start");
        m3();
        System.out.println("M2 End");
    }

    public static void m3() {
        System.out.println("M3 Start");
        throw new ArithmeticException();
    }
}
