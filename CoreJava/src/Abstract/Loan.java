package Abstract;

abstract class IntrestCalculator {
    String customer_name;
    long loan_amount;

    IntrestCalculator(String customer_name, long loan_amount) {
        //L.I
        this.customer_name = customer_name;
        this.loan_amount = loan_amount;
    }

    //Abstract Method
    public abstract double calculateIntrest();

    //Concrete method
    public void display() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Loan Amount: " + loan_amount);
    }
}

class Sbi extends IntrestCalculator {  //Service Provider
    Sbi(String customer_name, long loan_amount) {
        super(customer_name, loan_amount);
        //L.I
    }

    @Override
    public double calculateIntrest() {
        return loan_amount * 0.10;
    }
}

class Icici extends IntrestCalculator {
    Icici(String customer_name, long loan_amount) {
        super(customer_name, loan_amount);
    }

    @Override
    public double calculateIntrest() {
        return loan_amount * 0.15;
    }
}

public class Loan {
    static void main(String[] args) {
        IntrestCalculator ref1 = new Sbi("Anush", 50000);
        System.out.println("Intrest From SBI: " + ref1.calculateIntrest());
        Icici ref2 = new Icici("Sandhiya", 50000);
        System.out.println("Intrest From Icici: " + ref2.calculateIntrest());
    }
}
