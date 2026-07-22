package thread;

class Rams extends Thread {
    public void run() {
        for (int i = 10; i >= 5; i--) {
            System.out.println(Thread.currentThread().getName() + "+" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class multipleThreads_JoinMethod {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Rams t0 = new Rams();
        t0.start();
        t0.join();
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
