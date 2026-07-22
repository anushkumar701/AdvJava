package Control_Stmt;

import java.util.Scanner;

class prime {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        primeNumber(number);
    }

    public static void primeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime NUmber");
        } else {
            System.out.println("not a prime number");
        }
    }
}
