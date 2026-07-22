package stringBuffer;

import java.util.Arrays;

public class DicNum {
    static void main(String[] args) {
        String[] s = {"18", "1123", "24", "21", "32644", "334"};
        Arrays.sort(s);//Internally Using ComapreTo Func to Compare the StringI
        System.out.println(Arrays.toString(s));
    }

}
