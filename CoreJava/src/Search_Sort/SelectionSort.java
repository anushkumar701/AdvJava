package Search_Sort;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] a = {8, 14, 6, 7, -4, 3, 2, 10};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int s = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[s]) {
                    s = j;
                }
            }
            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;
        }
    }
}
