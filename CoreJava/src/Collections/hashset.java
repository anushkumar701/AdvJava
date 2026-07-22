package Collections;

import java.util.HashSet;

public class hashset {
    static void main(String[] args) {
        HashSet v=new HashSet();
        v.add(1);
        v.add("Tom");
        v.add(true);
        v.add(4.5);
        v.add(678789);
        v.add(null);
        System.out.println(v);
    }
}
