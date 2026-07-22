package MethodRefrence;

@FunctionalInterface
interface Master {
    void speak();
}

public class Person1 {
    static void speaksomething() {
        System.out.println("Speaking about Java");
    }
}
