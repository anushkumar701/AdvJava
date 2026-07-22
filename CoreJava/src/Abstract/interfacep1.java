package Abstract;

interface Atm {
    void withdraw();

    default void atmStatus() {
        checkBalanceByAtm();
        System.out.println("Atm is Ready:");
    }

    private void checkBalanceByAtm() {
        System.out.println("Balance Verified");
    }
}

class SBIATM implements Atm {  //Service Provider
    @Override
    public void withdraw() {
        System.out.println("Withdrawing from SBI ATM");
    }
}

public class interfacep1 {
    static void main(String[] args) {
        Atm ref = new SBIATM();
        ref.withdraw();
    }
}
