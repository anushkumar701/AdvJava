package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
    static void main(String[] args) {
        LinkedList al=new LinkedList();
        al.add(1);
        al.add("Anush");
        al.add('A');
        al.add(true);
        al.add(53.2);
        al.add(4514783452350L);
        al.add(null);
        al.add(1);
        al.add(null);
        System.out.println(al);
        al.remove(53.2);
        System.out.println(al);
        al.set(6,"Sandhiya");
        al.remove(2);
        System.out.println(al);
        System.out.println(al.contains(null));
        System.out.println(al.contains(2));
        System.out.println(al.contains(1));
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        for (int i=0 ; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("-------------------");
        for (int i = al.size()-1 ; i >= 0; i--) {
            System.out.println(al.get(i));
        }
    }
}
