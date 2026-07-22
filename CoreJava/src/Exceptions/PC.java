package Exceptions;

public class PC {//parent class

    static void main(String[] args) {
        System.out.println("Start");
        int[] a = {10, 20, 30};
        try {
            System.out.println(a[40]);
        } catch (Exception e) {
            System.out.println("Handled");
        }
        System.out.println("End");
    }
}
