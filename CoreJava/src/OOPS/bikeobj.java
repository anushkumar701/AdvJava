package OOPS;

class bike {
    static String owner = "Tabrez";
    String name;
    String color;
    double price;

    public void run() {
        System.out.println(name + "Running");
    }

    public void stop() {
        System.out.println(name + "Stopped");
    }
}

public class bikeobj {
    static void main(String[] args) {
        bike b1 = new bike();
        bike b2 = new bike();
        bike b3 = new bike();
        b1.name = "NInja";
        b1.color = "Red";
        b1.price = 100;
        b2.name = "Rx-100";
        b2.color = "Blue";
        b2.price = 200;
        b3.name = "Rx-200";
        b3.color = "Blue";
        b3.price = 300;
        System.out.println(b1.name);
        System.out.println(b1.color);
        System.out.println(b1.price);
        System.out.println(bike.owner);
        b1.run();
        System.out.println(b2.name);
        System.out.println(b2.color);
        System.out.println(b2.price);
        System.out.println(bike.owner);
        b2.run();
        System.out.println(b3.name);
        System.out.println(b3.color);
        System.out.println(b3.price);
        System.out.println(bike.owner);
        b3.run();

    }
}
