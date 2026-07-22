package String;

public class DuplicateCount {
    static void main(String[] args) {
        String s = "aaabbccdd";
        char[] a = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (s.indexOf(a[i]) == i)
                System.out.println(a[i] + ":" + count);
        }
    }
}
