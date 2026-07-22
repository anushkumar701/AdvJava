package String;

public class CaseConversion {
    static void main(String[] args) {
        String s = "Abc$#De";
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z')
                a[i] += 32;
            if (a[i] >= 'a' && a[i] <= 'z')
                a[i] -= 32;
        }
        return new String(a);//String<-----------char[]
    }
}
/*
aBC$#dE
 */