package OOPS;

class ATM {
    private final int pin;
    public String card_holder;
    public String exp;

    public ATM(String card_holder, String exp, int pin) {
        this.card_holder = card_holder;
        this.exp = exp;
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}

public class UserAtm {

}
