package MethodRefrence;

@FunctionalInterface
interface Game {
    void playGame(String g);
}

class Sport {
    Sport(String str) {
        System.out.println("We Are Playing :" + str);
    }
}

class Tennis {
    Tennis(String str) {
        System.out.println("We Are Playing :" + str);
    }
}

public class RefCons {
    static void main(String[] args) {
        Game g1 = Sport::new;
        Game g2 = Tennis::new;
        g1.playGame("Cricket");
        g2.playGame("Tennis");
    }
}
