package stringBuffer;

public class Prog2 {
    static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");//16+data
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

    }
}
