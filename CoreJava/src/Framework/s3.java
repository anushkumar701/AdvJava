package Framework;

import java.util.*;

public class s3 {
    public void m1(Object o){
        System.out.println(o);
    }
    public void m2(List l){
        System.out.println(l);
    }
    public void m3(Set s){
        System.out.println(s);
    }

    static void main(String[] args) {
        s3 t=new s3();
        t.m1(t);
        t.m2(new ArrayList());
        t.m3(new HashSet());
    }
}
