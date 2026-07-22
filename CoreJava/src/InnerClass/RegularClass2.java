package InnerClass;

class Payment {
    static void process() {
        String mode = "Phonepe";
        class Transaction {
            void details() {
                System.out.println("Payment Mode : " + mode);
            }
        }
        Transaction t = new Transaction();
        t.details();
    }
}

public class RegularClass2 {
    static void main(String[] args) {
        Payment p = new Payment();
        Payment.process();
    }
}
