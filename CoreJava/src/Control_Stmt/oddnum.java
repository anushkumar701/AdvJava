package Control_Stmt;

class oddnum {
    static void main(String[] args) {
        display();
    }

    public static void display() {
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
