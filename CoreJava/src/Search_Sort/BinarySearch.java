package Search_Sort;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        int[] a = {4, 6, 10, 12, 18, 19, 28, 38, 46, 52, 70, 78, 94};

        System.out.print("\t\t\tEnter the element: ");
        int key_element = sc.nextInt();

        System.out.println("Element Present ? : " + binarySearch(a, key_element));
        System.out.println(Arrays.toString(a));
    }

    public static boolean binarySearch(int[] a, int key_element) {
        int l = 0, h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (key_element == a[mid])
                return true;
            else if (key_element < a[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }
}