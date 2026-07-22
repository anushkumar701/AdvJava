package String;

public class RemoveDuplicates {
    static void main(String[] args) {
        String s1 = "Developer", s2 = "Programming";
        System.out.println(s1);
        System.out.println(removeDuplicates(s1));
        System.out.println(s2);
        System.out.println(removeDuplicates(s2));
    }

    public static String removeDuplicates(String str) {
        char[] a = str.toCharArray();
        String res = "";
        for (int i = 0; i < a.length; i++) {
            if (res.indexOf(a[i]) == -1)
                res += a[i];
        }
        return res;
    }
}
