class Multi {
    static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 8, 6},
                {2, 1, 3}};
        int[][] b = {
                {2, 3, 1},
                {6, 7, 5},
                {4, 5, 3}};
        Multiplication(a, b);
    }

    public static void Multiplication(int[][] a, int[][] b) {
        int row = a.length;
        int cola = a[0].length;
        int colb = b[0].length;
        int[][] c = new int[row][colb];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colb; j++) {
                for (int k = 0; k < cola; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colb; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}