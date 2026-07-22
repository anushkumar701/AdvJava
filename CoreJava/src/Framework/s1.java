package Framework;

public class s1 {

    String m1() {
        return "hello";
    }

    void m2() {
        System.out.println("Method m2");
    }

    static s1 m3() {
        return new s1();
    }

    Object m4() {
        return new Object();
    }

    public static void main(String[] args) {

        s1 d = s1.m3();

        System.out.println(d.m1());
        d.m2();
        d.m3();
    }
}