package thread;

public class lambaexpression {
    static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 3; i++) {
                System.out.println("Lambda Thread: " + i);
            }
        });
        t1.start();
        System.out.println("Main Thread Done");
        System.out.println("Main Thread Done");

    }
}
