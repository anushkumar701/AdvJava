package MDA;

import java.util.Arrays;

class UnionOf2Array {
    static void main(String[] args) {
        int[] a = {1, 8, 6, 4, 3};
        int[] b = {8, 1, 3, 5, 7, 2};
        int[] res = union(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] union(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        int[] res = new int[n1 + n2];

        // Planning for Merge
        int x = 0;
        for (int i = 0; i < n1; i++) {
            res[x++] = a[i];
        }
        System.out.println(Arrays.toString(res));

        for (int i = 0; i < n2; i++) {
            res[x++] = b[i];
        }
        System.out.println(Arrays.toString(res));

        Arrays.sort(res);
        System.out.println(Arrays.toString(res));

        int i = 0;
        for (int j = 1; j < res.length; j++) {
            if (res[i] != res[j]) {
                i++;
                res[i] = res[j];
            }
        }

        return Arrays.copyOf(res, i + 1);
    }
}

/*
[1, 8, 6, 4, 3, 0, 0, 0, 0, 0, 0]
[1, 8, 6, 4, 3, 8, 1, 3, 5, 7, 2]
[1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 8]
[1, 2, 3, 4, 5, 6, 7, 8]
*/