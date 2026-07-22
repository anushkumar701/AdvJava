package InnerClass;

abstract class Trainer {
    abstract void skill();

    abstract void sing();
}

public class AnonymousClass {
    static void main(String[] args) {
        Trainer t = new Trainer() {
            @Override
            public void skill() {
                System.out.println("Teaching java");
            }

            @Override
            public void sing() {
                System.out.println("Sing Tum Hi Ho");
            }
        };
        t.skill();
        t.sing();
    }
}
