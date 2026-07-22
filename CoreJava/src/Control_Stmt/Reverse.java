package Control_Stmt;

class Reverse {
    static void main(String[] args) {
        int[] a = {12, 13, 17, 18};
        double[] b = {2.3, 7.6, 6.2, 9.2};
        for (int i = (a.length - 1); i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("______________________________");
        for (int i = (b.length - 1); i >= 0; i--) {
            System.out.print(b[i] + " ");
        }

    }
}
