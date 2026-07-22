class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;

        while (n > 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    static void main(String[] args) {
        System.out.println(isPowerOfTwo(21));
    }
}