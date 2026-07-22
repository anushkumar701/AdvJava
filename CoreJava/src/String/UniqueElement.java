package String;

public class UniqueElement {
    static void main(String[] args) {
        String s1 = "ababcdd", s2 = "abbagdEE";
        System.out.println(firstUniqueCharacter(s1));
        System.out.println(firstUniqueCharacter(s2));

    }

    public static char firstUniqueCharacter(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i]))
                return a[i];
        }

        return ' ';
    }
}
