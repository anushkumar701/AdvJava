package Control_Stmt;

import java.util.Scanner;

class iftest1 {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("The number is positive");
        }

    }
}