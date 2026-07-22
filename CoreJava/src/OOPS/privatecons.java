package OOPS;

public class privatecons {
    private String name;
    private double price;

    privatecons(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private privatecons() {
    }

    public static privatecons getmethod(String name, double price) {
        return new privatecons(name, price);
    }

    static void main(String[] args) {
        privatecons p1 = new privatecons("Poco", 34000);
        System.out.println(p1);
        privatecons p2 = new privatecons("Moto", 23000);
        System.out.println(p2);
        p1.display();
        p2.display();
    }

    public void display() {
        System.out.println(name + " " + price);
    }
}
