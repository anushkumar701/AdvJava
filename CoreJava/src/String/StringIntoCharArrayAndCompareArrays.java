/*
Method name                          returnType          Purpose
toCharArray()                        char[]              Convert String into char[]
Array.equals(Array1,Array2)          boolean             Compares the 2 Array
 */


package String;

import java.util.Arrays;

public class StringIntoCharArrayAndCompareArrays {
    static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "ABCD";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        System.out.println(s1.equals(b));//String Content Comparison
        System.out.println(Arrays.equals(a, b));//Array Comparison
    }
}
