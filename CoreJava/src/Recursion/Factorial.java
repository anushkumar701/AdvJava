package Recursion;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        System.out.print("Enter N Value:");
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
