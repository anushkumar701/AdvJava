package thread;

public class deadlock {
    static Object lockA = new Object();
    static Object lockB = new Object();

    static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread-X: Holding Lock-A...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread-X: Waiting for lock B");
                synchronized (lockB) {
                    System.out.println("Thread-1: Got Both Locks!");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread-X: Holding Lock-A...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread-Y is waiting for lock A");
                synchronized (lockA) {
                    System.out.println("Thread-1: Got Both Locks!");
                }
            }
        });
        t1.start();
        t2.start();


    }
}
