package thread;

public class threadnameid_priority {
    static void main(String[] args) {
        System.out.println("Hi I am :" + Thread.currentThread().getName());
        System.out.println("My Id is :" + Thread.currentThread().getId());
        System.out.println("My Priority :" + Thread.currentThread().getPriority());
    }
}