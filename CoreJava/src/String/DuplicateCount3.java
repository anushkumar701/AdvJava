package String;

public class DuplicateCount3 {
    public static boolean checkDuplicates(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (res.indexOf(s.charAt(i)) == -1)
                res += s.charAt(i);
            else
                return true;
        }
        return false;
    }

    static void main(String[] args) {
        String s = "abcdefga";
        System.out.println(checkDuplicates("Swimming"));
        System.out.println(checkDuplicates("abcd"));
    }
}
