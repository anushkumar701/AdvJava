package thread;

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2)
            System.out.println("Odd Thread :" + i);
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2)
            System.out.println("Even Thread : " + i);
    }
}

public class multiple_threads_and_running_both_simuntaneously {
    static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();
        t2.start();
    }
}
