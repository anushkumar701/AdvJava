package Array;

import java.util.Arrays;

public class ZigZag {
    static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {50, 60, 70, 80};
        int[] res = solve(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int x = 0, y = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0)
                res[i] = a[y++];
            else
                res[i] = b[x++];
        }
        return res;
    }
}
