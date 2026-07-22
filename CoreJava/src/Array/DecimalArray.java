package Array;

import java.util.Scanner;

public class DecimalArray {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        System.out.print("Enter the Size:");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
    }
}
