package object_class;

import java.util.Objects;

public class Product {
    int pid;
    String pname;
    double price;

    public Product(int pid, String pname, double price) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    static void main(String[] args) {
        Product p1 = new Product(1, "p1", 100.0);
        Product p2 = new Product(2, "p2", 200.0);
        Product p3 = new Product(3, "p3", 300.0);
        System.out.println(p1);
        System.out.println("Compare Prodcut-1 && Prodcut -3 is Same?");
        System.out.println(p1.equals(p3));
        System.out.println("Is Product-1 &# HashCode Same");
        System.out.println(p1.hashCode() == p3.hashCode());
    }

    @Override
    public String toString() {
        return "PID-" + pid + "-" + pname + "-" + price;
    }

    @Override
    public boolean equals(Object o) {
        Product p = (Product) o;
        return (p.pid == this.pid && p.pname.equals(this.pname) && p.price == this.price);
    }

    public int hashCode(Object obj) {
        return Objects.hash(pid, pname, price);
    }
}
