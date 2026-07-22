package String;

public class ReverseSplit {
    public static String solve(String s) {
        String[] a = s.split(" ");
        String ans = "";
        for (int i = a.length - 1; i >= 0; i--)
            ans += a[i] + " ";
        return ans;
    }

    static void main(String[] args) {
        String s = "En Peruh Ben TennySon";
        System.out.println(solve(s));
    }
}
