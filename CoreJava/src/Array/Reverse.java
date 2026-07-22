package Array;

import java.util.Arrays;

public class Reverse {
    public static void reverse(char[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {  //l!=r
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    static void main() {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
