import java.util.Scanner;

class iftest5 {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Enter the charecter :");
        char a = sc.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("the charecter is vowel");
        }

    }
}
