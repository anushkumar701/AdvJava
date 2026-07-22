package thread;

class Ram extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i++) {
            System.out.println(Thread.currentThread().getName() + "+" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class multiplethread_without_join_method {
    static void main(String[] args) {
        System.out.println("Start");
        Ram t0 = new Ram();
        t0.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End");
    }
}
