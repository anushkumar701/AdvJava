package thread;

class BankAccount {
    int balance = 1000;

    void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "want to withdraw: " + amount);
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "withdrew Balance: " + balance);
        } else
            System.out.println(Thread.currentThread().getName() + " - Insufficient Balance");
    }
}

public class raceCondition_ConcurrencyProblem {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread ram = new Thread(() -> account.withdraw(800), "Ram");
        Thread sita = new Thread(() -> account.withdraw(800), "Sita");
        ram.start();
        sita.start();
    }

}
