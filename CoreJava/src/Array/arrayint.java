import java.util.Arrays;
import java.util.Scanner;

class arrayint {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.print("Enter the array Size :");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("\t Enter The the array number" + (i + 1) + ":");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
