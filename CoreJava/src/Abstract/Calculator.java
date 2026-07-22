package Abstract;

@FunctionalInterface
interface Calci {
    int add(int a, int b);
}

public class Calculator {
    static void main(String[] args) {
        Calci c = (x, y) -> {
            System.out.println("Addition of Two Values is ");
            return x + y;
        };
        System.out.println(c.add(1, 2));
    }
}
