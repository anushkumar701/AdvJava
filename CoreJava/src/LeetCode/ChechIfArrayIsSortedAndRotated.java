public class ChechIfArrayIsSortedAndRotated {
    public static boolean check(int[] a) {
        int count = 0;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i])
                count++;
        }
        if (a[n - 1] > a[0])
            count++;
        return count <= 1;
    }

    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {3, 4, 5, 1, 2};
        int[] c = {3, 4, 1, 5, 2};
        System.out.println(check(a));
        System.out.println(check(b));
        System.out.println(check(c));
    }
}
