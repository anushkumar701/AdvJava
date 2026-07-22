package LeetCode;

/*
INPUT:strs=['flower',"flow",
 */
public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";
        String s = strs[0];
        int n = strs.length;
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
            }
            if (s.equals(""))
                return "";
        }
        return s;
    }

    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
