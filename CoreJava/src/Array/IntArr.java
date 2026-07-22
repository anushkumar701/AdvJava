import java.util.Arrays;
import java.util.Scanner;

public class IntArr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Inputs:");
        int inp = sc.nextInt();
        int[] arr = new int[inp];
        for (int i = 0; i < inp; i++) {
            System.out.print("Enter the Element[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
