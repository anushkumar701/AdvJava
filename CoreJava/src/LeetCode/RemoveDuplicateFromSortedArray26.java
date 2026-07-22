package LeetCode;

public class RemoveDuplicateFromSortedArray26 {
    public static int removeDuplicates(int[] a) {
        int i = 0;
        int n = a.length;
        if (n == 0)
            return 0;
        for (int j = 1; j < n; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }

    static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(a));
    }
}
