import java.util.Scanner;

class iftest2 {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("number is divisble by 5");
        }

    }
}
