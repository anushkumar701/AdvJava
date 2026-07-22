package String;

import java.util.Arrays;

public class Split {
    static void main(String[] args) {
        String s = "Na Dha Ben TennySon";
        String[] r = s.split(" ");
        String[] t = s.split("");
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(t));
    }
}
