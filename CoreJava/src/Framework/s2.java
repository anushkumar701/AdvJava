package Framework;

import java.util.ArrayList;
import java.util.List;

interface Animal {

}

class Donkey implements Animal {

}

public class s2 {

    Animal m1() {
        return new Donkey();
    }

    static Object m2() {
        return new s2();
    }

    List m3() {
        return new ArrayList();
    }

    public static void main(String[] args) {

        Object o = s2.m2();
        s2 d = (s2) o;
        List l = d.m3();

        System.out.println(l);
    }
}