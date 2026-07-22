package Control_Stmt;

//import java.util.Scanner;
class printnum {
    //	static Scanner sc=new Scanner(System.in);
    static void main(String[] args) {
        display();
    }

    public static void display() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
