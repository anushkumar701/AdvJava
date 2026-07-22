package String;

public class ReverseSC {
    static void main(String[] args) {
        String s = "Hi@how#1you";
        System.out.println(solve(s));

    }

    public static String solve(String s) {
        char[] a = s.toCharArray();
        int l = 0, r = a.length - 1;
        while (l < r) {
            if (Character.isLetter(a[l]) && Character.isLetter(a[r])) {
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            if (!Character.isLetter(a[l]))
                l++;
            if (!Character.isLetter(a[r]))
                r--;
        }
        return new String(a);
    }
}
