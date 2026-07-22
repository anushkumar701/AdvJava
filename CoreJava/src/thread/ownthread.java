package thread;

public class ownthread extends Thread {
    static void main(String[] args) {
        ownthread my_thread = new ownthread();
        my_thread.start();//start() calls run() internally
    }

    @Override
    public void run() {
        System.out.println("Hey I am : " + Thread.currentThread().getName());
    }
}
