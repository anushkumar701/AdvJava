package OOPS;

class PrimeMinister {
    private static final String country = "India";
    private static PrimeMinister pm;
    private final String name;

    private PrimeMinister(String name) {
        this.name = name;
    }

    public static PrimeMinister getPrimeMinister(String name) {
        if (pm == null)
            pm = new PrimeMinister(name);
        return pm;
    }

    public String display() {
        return name;
    }
}

public class singleton {
    static void main(String[] args) {
        PrimeMinister pm1 = PrimeMinister.getPrimeMinister("Modi");
        PrimeMinister pm2 = PrimeMinister.getPrimeMinister("Anush");
        System.out.println(pm1);
        System.out.println(pm2);
        System.out.println(pm1.display());
        System.out.println(pm2.display());
    }
}
