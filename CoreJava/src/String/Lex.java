package String;

public class Lex {
    static void main(String[] args) {
        String[] s = {"Ajay", "Apple", "Adam", "Anush"};
        System.out.println(solve(s));
    }

    public static String solve(String[] s) {
        String[] a = s;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[i]) < 0) {   // ascending order
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return String.join(" ", a);
    }
}