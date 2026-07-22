package Loop;

import java.util.Scanner;

public class ArmStrongNumber {
    static Scanner sc = new Scanner(System.in);

    public static boolean isArmStrong(int num) {
        int count = 0, temp = num, sum = 0;
        for (int i = num; i > 0; count++) {
            i /= 10;
        }
        while (num > 0) {
            int last = num % 10;
            int ans = 1;
            for (int i = 1; i <= count; i++) {
                ans += last;
                sum += ans;
                num /= 10;
            }
        }
        return temp == sum;
    }

    static void main() {
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println(isArmStrong(num));
    }
}
