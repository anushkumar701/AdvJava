package LeetCode;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void moveZeroes(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0, x = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[x++] = a[i];
            }
        }
        System.arraycopy(b, 0, a, 0, a.length);
    }

    static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 0, 5};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
