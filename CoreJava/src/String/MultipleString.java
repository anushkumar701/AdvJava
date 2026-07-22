package String;

public class MultipleString {
    static void main(String[] args) {
        solve("a10b4c12d1");
    }

    public static void solve(String s) {
        char[] a = s.toCharArray();
        String nums = "";
        for (int i = 1; i < a.length; i++) {
            if (Character.isDigit(a[i]))
                nums += a[i];
            else
                nums += " ";
        }
        String[] b = nums.split(" ");
        for (int i = 0, x = 0; i < a.length; i++) {
            if (Character.isLetter(a[i])) {
                for (int j = 0; j <= Integer.parseInt(b[x]); j++) {
                    System.out.print(a[i] + " ");
                }
                x++;
                System.out.println();
            }
        }
    }
}

/*
a a a a a a a a a a a
b b b b b
c c c c c c c c c c c c c
d d
 */