package MDA;

import java.util.Scanner;

class Traversal {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) throws Exception {
        int[][] a = new int[5][5];

        insertElements(a);

        System.out.println("\t\t\tProcessing...");
        System.out.println("\t\t\tT2B L2R...");
        Thread.sleep(3000);
        t2bl2r(a);

        System.out.println("\t\t\tProcessing...");
        System.out.println("\t\t\tT2B R2L...");
        Thread.sleep(3000);
        t2br2l(a);

        System.out.println("\t\t\tProcessing...");
        System.out.println("\t\t\tB2T L2R...");
        Thread.sleep(3000);
        b2tl2r(a);
    }

    public static void insertElements(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t\t\tEnter the number a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void t2bl2r(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void t2br2l(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void b2tl2r(int[][] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}