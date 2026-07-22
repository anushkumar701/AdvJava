package GenericClass;

import java.util.ArrayList;
import java.util.Objects;

public class for_each_loop {
    static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("Tom");
        al.add(3.12);
        al.add(true);
        al.add(5);
        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i));
        System.out.println("-------------------");
        for (Object o : al)
            System.out.println(o);
    }
}