package Polymorphism;

public class MethodOverriding {
    void game() {
        System.out.println("Playing Kabbadi");
    }

    public void ride() {
        System.out.println("Bike Riding");
    }
}

class Tabrez extends MethodOverriding {
    static void main(String[] args) {
        MethodOverriding m = new Tabrez();
        m.ride();
        m.game();

    }

    @Override
    public void game() {
        System.out.println("Playing Cricket");
    }
}
