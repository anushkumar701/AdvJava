package InnerClass;

class Laptop {
    private final String brand = "Dell";

    class Processor {
        void show() {
            System.out.println("Brand:" + brand);
            System.out.println("Processor: Intel i7");
        }
    }
}

public class RegularClass {
    static void main(String[] args) {
        Laptop l = new Laptop();
        Laptop.Processor p = l.new Processor();
        p.show();
    }
}
