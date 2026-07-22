/*

Input:The Quick Brown Fox Jumps Over The Lazy Dog
O/P:True
*/
package String;

public class Pangram {
    public static boolean isPangram(String str) {
        str = str.toUpperCase();
        char[] a = str.toCharArray();
        boolean[] b = new boolean[26];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                b[a[i] - 'A'] = true; //b[Q-'A']
                //b[81-65]
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) { //(!b[i])
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        String str = "The Quick Brown Fox Jumps Over The Lazy Do";
        System.out.println(isPangram(str));
    }
}
