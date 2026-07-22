package Abstract;

interface Skill {
    void teach();
}

class tabrez implements Skill {
    @Override
    public void teach() {
        System.out.println("Teaching Java");
    }
}

class Mahesh implements Skill {
    @Override
    public void teach() {
        System.out.println("Teaching Python");
    }
}

public class p3 {
    static void main(String[] args) {
        Skill S1 = new tabrez();
        Skill S2 = new Mahesh();
        S1.teach();
        S2.teach();
    }
}
