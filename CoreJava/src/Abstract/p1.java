package Abstract;

abstract class Hotel {
    abstract public void biriyani();

    abstract public void gheeRice();
}

class Chef extends Hotel {
    @Override
    public void biriyani() {
        System.out.println("Biriyani Ready!!!");
    }

    @Override
    public void gheeRice() {
        System.out.println("Ghee Rice Ready!!!");
    }
}

public class p1 {
    static void main(String[] args) {
        Hotel h = new Chef();
        h.gheeRice();
        h.biriyani();
    }
}
