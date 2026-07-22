package String;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        return str.equals(rev);
    }

    static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
