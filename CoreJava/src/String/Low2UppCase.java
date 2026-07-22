package String;

/*
METHOD NAME             RETURNTYPE      PURPOSES
toUppperCase()             String        Converts to UpperCase
toUppperLower()             String        Converts to LowerCase
 */
public class Low2UppCase {
    static void main(String[] args) {
        String S1 = "ABcdeF";
        String ans1 = S1.toUpperCase();
        String ans2 = S1.toLowerCase();
        System.out.println(S1);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}

/*
ABcdeF
ABCDEF
abcdef
*/