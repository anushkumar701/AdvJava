package Control_Stmt;

import java.util.Scanner;

public class LogicMaster {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrome(int number) {
        int temp = number, rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev == temp;
    }

    public static String deciToBin(int number) {
        String ans = "";
        while (number > 0) {
            ans = number % 2 + ans;
            number /= 2;
        }
        return ans;
    }

    public static int binToDec(int bin) {
        int x = 1, sum = 0;
        while (bin > 0) {
            sum = sum + (bin % 10 * x);
            x *= 2;
            bin /= 10;
        }
        return sum;
    }

    public static int digitalSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumOfFirstAndLastDigit(int number) {
        int last_digit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return (number + last_digit);
    }

    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    static void main(String[] args) {
        do {
            System.out.println("umber Programing");
            System.out.println("1.Palindrome");
            System.out.println("2.Digital Sum");
            System.out.println("3.Sum of First and Last");
            System.out.println("4.Count Digits");
            System.out.println("5.Binary to Decimal");
            System.out.println("6.Decimal to Binary");
            System.out.println("7.Exit");
            System.out.print("Select Input:");
            int input = sc.nextInt();
            if (input == 7) {
                System.out.println("Thank You");
                return;
            }
            System.out.print("Enter the Number");
            int number = sc.nextInt();
            switch (input) {
                case 1 -> System.out.println(isPalindrome(number) ? "Palindrome" : "Not Palindrome");
                case 2 -> System.out.println(digitalSum(number));
                case 3 -> System.out.println(sumOfFirstAndLastDigit(number));
                case 4 -> System.out.println(countDigit(number));
                case 5 -> System.out.println(binToDec(number));
                case 6 -> System.out.println(deciToBin(number));
            }
        } while (true);

    }

}
