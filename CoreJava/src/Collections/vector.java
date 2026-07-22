package Collections;

import java.util.Iterator;
import java.util.Vector;

public class vector {
    static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add("Tom");
        v.add(true);
        v.add(4.5);
        v.add(678789);
        v.add(null);
        System.out.println(v);
        v.remove(null);
        System.out.println(v);
        System.out.println(v.contains(1));
        System.out.println(v.size());
        for (Object o : v)
            System.out.println(o);
        System.out.println("-------------");
        Iterator it=v.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
