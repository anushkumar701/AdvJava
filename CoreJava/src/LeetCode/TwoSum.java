package LeetCode;

import java.util.Arrays;

class TwoSum {

    public static int[] twoSum(int[] a, int target) {
        int[] res = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        int[] r = twoSum(a, target);
        System.out.println(Arrays.toString(r));
    }
}