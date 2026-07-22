package Search_Sort;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a = {8, 7, 6, 4, 3, 1, 2};
        System.out.print("Enter The Element:");
        int key_element = sc.nextInt();
        System.out.println("Element Present? " + linearSearch(a, key_element));
    }

    public static boolean linearSearch(int[] a, int key_element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key_element) {
                return true;
            }
        }
        return false;
    }
}
