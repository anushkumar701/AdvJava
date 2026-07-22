import java.util.Scanner;

public class Sumofnum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int inp = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= inp; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
