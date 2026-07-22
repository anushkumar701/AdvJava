package String;

public class CountVowels {
    static void main(String[] args) {
        String s1 = "This is Java Program";
        char[] a = s1.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    count++;
            }
        }
        System.out.println(count);
    }
}
