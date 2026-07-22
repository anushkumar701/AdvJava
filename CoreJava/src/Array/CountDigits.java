package Array;

import java.util.Arrays;

public class CountDigits {
    static void main(String[] args) {
        int[] a = {841, 93, 48, 149, 248};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = getCount(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }

    public static int getCount(int n) {
        if (n == 0) {
            return 0;
        }
        return (int) Math.log10(n) + 1;
    }
}
