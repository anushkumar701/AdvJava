package thread;

public class assignnameforthreads extends Thread {
    static void main(String[] args) {
        assignnameforthreads my_threads1 = new assignnameforthreads();
        assignnameforthreads my_threads2 = new assignnameforthreads();
        my_threads1.setName("Anush");
        my_threads2.setName("Kumar");
        my_threads1.start();//start() calls run() internally
        my_threads2.start();//start() calls run() internally
    }

    public void run() {
        System.out.println("Hey I am :" + Thread.currentThread().getName());
    }
}


