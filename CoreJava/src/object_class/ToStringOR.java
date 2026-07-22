package object_class;

public class ToStringOR {
    String name;
    double price;

    public ToStringOR(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    static void main(String[] args) {
        ToStringOR t1 = new ToStringOR("POCO", 18000);
        System.out.println(t1);
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }
}
