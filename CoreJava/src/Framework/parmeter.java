package Framework;

import java.util.ArrayList;

public class parmeter {
    public void m1(parmeter p){
        System.out.println(p);
    }
    public void m2(Object o){
        System.out.println(o);
    }
    public void m3(ArrayList al){
        System.out.println(al);
    }

    static void main(String[] args) {
        parmeter p=new parmeter();
        p.m1(p);
        p.m2(new Object());
        p.m3(new  ArrayList());
    }
}
