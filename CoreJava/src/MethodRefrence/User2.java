package MethodRefrence;

@FunctionalInterface
interface Song {

    void sing();
}

@FunctionalInterface
interface Subjeect {

    String revealSubject();
}

class Kgf {

    public void salamRockyBhai() {

        System.out.println("Salam Rocky Bhai");
    }
}

class Nagaraj {

    public String nagrajSubject() {

        System.out.println("Nagaraj Teaches SQL...");
        return "Nagaraj Teaches SQL...";
    }
}

public class User2 {

    static void main(String[] args) {

        Kgf k = new Kgf();

        Song s = k::salamRockyBhai;

        s.sing();

        Nagaraj n = new Nagaraj();

        Subjeect sub = n::nagrajSubject;

        String res = sub.revealSubject();

        System.out.println("Nagaraj is : " + res);
    }
}