package Search_Sort;

import java.util.Arrays;

class MergeSort {
    static void main(String[] args) {
        int[] a = {8, 7, 4, 1, 5, 2, 3};

        System.out.println(Arrays.toString(a));
        divide(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void divide(int[] a, int l, int h) {
        if (l == h)
            return;

        int m = (l + h) / 2;

        divide(a, l, m);
        divide(a, m + 1, h);

        merge(a, l, m, h);
    }

    public static void merge(int[] a, int l, int mid, int h) {
        int left = l, right = mid + 1;

        int[] b = new int[a.length];
        int x = 0;

        while (left <= mid && right <= h) {
            if (a[left] < a[right])
                b[x++] = a[left++];
            else
                b[x++] = a[right++];
        }

        while (left <= mid)
            b[x++] = a[left++];

        while (right <= h)
            b[x++] = a[right++];

        x = 0;
        for (int i = l; i <= h; i++) {
            a[i] = b[x++];
        }
    }
}