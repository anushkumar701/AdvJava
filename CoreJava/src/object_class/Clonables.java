package object_class;

class Clonables implements Cloneable {
    String name;
    int age;

    public Clonables(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    static void main(String[] args) throws CloneNotSupportedException {
        Clonables c1 = new Clonables("CSE", 10);
        Clonables c2 = (Clonables) c1.clone();
        Clonables c3 = (Clonables) c2.clone();
        c1.details();
        c2.details();
        c3.details();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------------");
    }
}
