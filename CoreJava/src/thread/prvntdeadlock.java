package thread;

public class prvntdeadlock {
    static Object lockA = new Object();
    static Object lockB = new Object();

    static void main(String[] args) {
        //Fix Both Threads acquire locks in same order: lockA first,then LockB
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                synchronized (lockB) {
                    System.out.println("Thread-1: Done");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lockA) {
                synchronized (lockB) {
                    System.out.println("Thread 2 : is Done");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
