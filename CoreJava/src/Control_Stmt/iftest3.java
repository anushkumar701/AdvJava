package Control_Stmt;

import java.util.Scanner;

class iftest3 {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("number is EVEN	");
        }

    }
}
