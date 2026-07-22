package String;

public class Concan {
    static void main(String[] args) {
        String s1 = "abcde", s2 = "cdeab";
        s1 = s1 + s1;
        System.out.println(s1.contains(s2));
    }
}
