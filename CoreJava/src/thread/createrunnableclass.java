package thread;

class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println(Thread.currentThread().getName() + " -Task: " + i);
    }
}

public class createrunnableclass {
    static void main(String[] args) {
        MyTask task = new MyTask();//Runnable Object
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        t1.start();
        t2.start();
    }
}
//Output may change