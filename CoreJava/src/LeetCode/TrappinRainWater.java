public class TrappinRainWater {
    public static int trap(int[] b) {
        if (b.length == 1 || b.length == 2)
            return 0;
        int n = b.length;
        int[] left_max = new int[n];
        left_max[0] = b[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(b[i], left_max[i - 1]);
        }
        int[] right_max = new int[n];
        right_max[n - 1] = b[n - 1];
        for (int i = n - 2; i > 0; i--)
            right_max[i] = Math.max(b[i], right_max[i + 1]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int wl = Math.min(left_max[i], right_max[i]);
            sum += wl - b[i];
        }
        return sum;
    }

    static void main(String[] args) {
        int[] b = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(b));
    }
}
