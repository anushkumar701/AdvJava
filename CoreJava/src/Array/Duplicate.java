package Array;

import java.util.Arrays;

public class Duplicate {
    public static boolean isDuplicate(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1])
                return true;
        }
        return false;
    }

    static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 5};
        System.out.println(isDuplicate(a));
    }
}
