package String;

public class Replace2 {
    static void main(String[] args) {
        String s = "I Love Biriyani";
        String ans = solve(s, "Love", "Hate");
        System.out.println(ans);
    }

    public static String solve(String s, String r1, String r2) {
        String[] a = s.split(" ");
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(r1))
                a[i] = r2;
            ans += a[i] + " ";
        }
        return ans;
    }
}
