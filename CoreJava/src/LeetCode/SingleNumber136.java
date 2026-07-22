package LeetCode;

public class SingleNumber136 {
    public static int singleNumber(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++)
            ans = ans ^ a[i];
        return ans;
    }

    static void main(String[] args) {
        int[] a = {4, 4, 5};
        int res = (singleNumber(a));
        System.out.println(res);
    }
}
