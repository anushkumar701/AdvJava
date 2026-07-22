package Polymorphism;

public class finalmethod {
    public final void dance() {
        System.out.println("Hip-Hop");
    }
}

class B extends finalmethod {
    /*
    @Override
    public void dance(){
        System.out.println("Barathanatiyam");
    }
    final method cannot be overrided
    */
    static void main(String[] args) {
        B ref = new B();
        ref.dance();
    }
}
