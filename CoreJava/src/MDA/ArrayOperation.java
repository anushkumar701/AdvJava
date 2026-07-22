package MDA;

import java.util.Arrays;

class ArrayOperation {
    static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {3, 0, 0, 1, 0, 4, 0, 0},
                {1, 2, 3, 5, 6}
        };

        for (int i = 0; i < a.length; i++) {
            if (i == 0)
                reverse(a[i], 0, a[i].length - 1);
            else if (i == 1)
                moveZero(a[i]);
            else if (i == 2)
                missing(a[i]);

            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void moveZero(int[] a) {
        int i = 0, n = a.length;

        for (int j = 0; j < n; j++) {
            if (a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
    }

    public static void missing(int[] a) {
        int n = a[a.length - 1];
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
        }

        Arrays.fill(a, sum);
    }
}