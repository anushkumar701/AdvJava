/*
How will u compare the String ang get know eho is Greater in Dicitonary Arrangement
currString == PassedString---->0
currString > PassedString --->+ve
currString < PassesString --->-ve
Why we need this ---> Helps in Sorting the String
 */

package stringBuffer;

public class cmpr {
    static void main(String[] args) {
        String s1 = "Kratos";
        String s2 = "Momo";
        String s3 = "Kratos";
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s2));

    }
}
