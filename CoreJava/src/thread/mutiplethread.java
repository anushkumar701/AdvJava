package thread;

public class mutiplethread extends Thread {
    static void main(String[] args) {
        mutiplethread my_thread1 = new mutiplethread();
        mutiplethread my_thread2 = new mutiplethread();
        mutiplethread my_thread3 = new mutiplethread();
        mutiplethread my_thread4 = new mutiplethread();
        my_thread1.start();//start() calls run() internally
        my_thread2.start();
        my_thread3.start();
    }

    @Override
    public void run() {
        System.out.println("Hey I am : " + Thread.currentThread().getName());
    }
}
