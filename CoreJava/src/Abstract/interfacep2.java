package Abstract;

interface UPI {
    void sendMoney();

    void receiveMoney();

    default void appStatus() {
        checkInternet();
        System.out.println("Application is Ready");
    }

    private void checkInternet() {
        System.out.println("Internet Conection is good");
    }
}

class Gpay implements UPI {
    @Override
    public void sendMoney() {
        System.out.println("Sending Money");
    }

    @Override
    public void receiveMoney() {
        System.out.println("Receiving Money");
    }
}

public class interfacep2 {
    static void main() {
        UPI upi = new Gpay();
        upi.appStatus();
        upi.sendMoney();
        upi.receiveMoney();
    }
}
