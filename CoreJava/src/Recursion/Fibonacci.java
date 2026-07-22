package Recursion;

public class Fibonacci {
    static int series = 10;

    static void main() {
        int n1 = 0, n2 = 1;
        fibonacci(n1, n2);
    }

    public static void fibonacci(int n1, int n2) {
        if (series >= 1) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            series--;
            fibonacci(n1, n2);
        }
    }
}
