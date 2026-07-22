import java.util.Arrays;
import java.util.Scanner;

class arraydouble {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        double[] a = new double[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the Array Value of " + (i + 1) + " :");
            a[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(a));
    }
}
