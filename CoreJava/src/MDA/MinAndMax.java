package MDA;

class MinAndMax {
    static void main(String[] args) {
        int[][] a = {
                {8, 1, 3, 7},
                {7, 6, 5},
                {4, 6, 2, 1, -8, 3, 9}
        };

        for (int i = 0; i < a.length; i++) {
            int minimum = Integer.MAX_VALUE;
            int maximum = Integer.MIN_VALUE;

            for (int j = 0; j < a[i].length; j++) {
                maximum = Math.max(a[i][j], maximum);
                minimum = Math.min(a[i][j], minimum);
            }

            System.out.println("Minimum : " + minimum + "\tMaximum : " + maximum);
        }
    }
}