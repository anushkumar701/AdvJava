package OOPS;

class person {
    static String country = "INdia";
    String name;
    int age;
    double weight;

    public void details() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("weight:" + weight);
    }
}

public class Instantiation {
    static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        person p3 = new person();
        p1.name = "Anush";
        p1.age = 10;
        p1.weight = 100;
        p2.name = "Anush";
        p2.age = 20;
        p2.weight = 100;
        p3.name = "Anush";
        p3.age = 30;
        p3.weight = 100;
        p1.details();
        p2.details();
        p3.details();

    }
}

