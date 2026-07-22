package LeetCode;

public class PivotTable724 {
    public static int pivotIndex(int[] a) {
        int sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int left = 0, right = sum;
        for (int i = 0; i < n; i++) {
            right = sum - left - a[i];
            if (right == left)
                return i;
            left += a[i];
        }
        return -1;
    }

    static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(a));
    }

}
