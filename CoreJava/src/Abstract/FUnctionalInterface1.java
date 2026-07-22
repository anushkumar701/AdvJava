package Abstract;

@FunctionalInterface
interface Vehicle {
    void run();
}

public class FUnctionalInterface1 {
    static void main(String[] args) {
        System.out.println("Start");
        Vehicle v = () -> {
            System.out.println("Vehicle is Running");
        };
        v.run();
        System.out.println("End");
    }
}
