package String;

import java.util.Arrays;

public class BiggestNumber {
    static void main(String[] args) {
        int[] a = {21, 46, 9, 7};
        System.out.println(biggestNumber(a));
    }

    public static int biggestNumber(int[] a) {
        String[] S = new String[a.length];
        for (int i = 0; i < a.length; i++)
            S[i] = a[i] + "";
        String ans = "";
        Arrays.sort(S);
        for (int i = S.length - 1; i >= 0; i--) {
            ans += S[i];
        }
        return Integer.parseInt(ans);
    }
}
