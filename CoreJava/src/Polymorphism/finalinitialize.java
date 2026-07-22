package Polymorphism;

public class finalinitialize {
    final static int X;

    static {
        X = 10;
    }

    final String SKILL;

    {
        SKILL = "SQL";
    }
}

record finalcons(String SKILL) {
}
