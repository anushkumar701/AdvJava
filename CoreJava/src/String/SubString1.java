package String;

public class SubString1 {
    static void main(String[] args) {
        solve("abcde");
    }

    public static void solve(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                s.substring(i, j);
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }
    }

}
