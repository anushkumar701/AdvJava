package InnerClass;

interface button {
    void click();
}

public class Anonymous2 {
    static void main(String[] args) {
        button B = new button() {
            public void click() {
                System.out.println("Button Clicked");
            }
        };
        B.click();
    }
}
