package Control_Stmt;

public class HollowHeart {

    // helper method for delay
    public static void printWithDelay(String s) {
        try {
            System.out.print(s);
            Thread.sleep(200); // 0.2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void main(String[] args) {
        int n = 6;

        // Top part
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                printWithDelay(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    printWithDelay("*");
                } else {
                    printWithDelay(" ");
                }
            }

            for (int j = 1; j <= n - i; j++) {
                printWithDelay(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    printWithDelay("*");
                } else {
                    printWithDelay(" ");
                }
            }

            System.out.println();
        }

        // Bottom part
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                printWithDelay(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1) {
                    printWithDelay("*");
                } else {
                    printWithDelay(" ");
                }
            }

            System.out.println();
        }
    }
}