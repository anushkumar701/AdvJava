package Recursion;

import java.util.Scanner;

public class OneToN {
    static int n;
    static Scanner sc = new Scanner(System.in);

    static void main() {
        System.out.print("Enter N Value:");
        n = sc.nextInt();
        solve(1);
    }

    public static void solve(int i) {
        if (i <= n) {
            System.out.print(i + " ");
            i++;
            solve(i);
        }
    }
}
