package MethodRefrence;

@FunctionalInterface
interface Remote {
    void powerOn();
}

public class Sony {
    static void display() {
        System.out.println("Power ON");
    }
}
