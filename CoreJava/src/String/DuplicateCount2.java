package String;

public class DuplicateCount2 {
    static void main(String[] args) {
        String s1 = "aabbaacc", s2 = "aaabbaa", s3 = "aaabbaaca", s4 = "aaaba";
        System.out.println(s1);
        solve(s1);
        System.out.println(s2);
        solve(s2);
        System.out.println(s3);
        solve(s3);
        System.out.println(s4);
        solve(s4);
    }

    public static void solve(String s) {
        char[] a = s.toCharArray();
        int count = 1, n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1])
                count++;
            else {
                System.out.println(a[i] + ":" + count);
                count = 1;
            }
        }
        System.out.println(a[n - 1] + ":" + count);
        System.out.println("---------------------------");
    }
}
/*
a:2
b:2
a:2
c:2
---------------------------
aaabbaa
a:3
b:2
a:2
---------------------------
aaabbaaca
a:3
b:2
a:2
c:1
a:1
---------------------------
aaaba
a:3
b:1
a:1
---------------------------
 */