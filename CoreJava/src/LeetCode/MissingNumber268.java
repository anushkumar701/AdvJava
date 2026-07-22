package LeetCode;

public class MissingNumber268 {
    public static int missingNumber(int[] a) {
        int n = a.length;
        int total_sum = n * (n + 1) / 2;
        for (int i = 0; i < a.length; i++) {
            total_sum -= a[i];
        }
        return total_sum;
    }

    static void main(String[] args) {
        int[] a = {0, 1, 3, 5, 2};
        System.out.println(missingNumber(a));
    }
}
