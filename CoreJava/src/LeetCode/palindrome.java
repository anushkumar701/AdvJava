class palindrome {
    public static boolean isPalindrome(int a) {
        if (a < 0) return false;
        int temp = a, rev = 0;
        while (a > 0) {
            int digits = a % 10;
            a = a / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return false;
            rev = rev * 10 + digits;
        }

        return temp == rev;
    }

    static void main(String[] args) {
        System.out.println(isPalindrome(184648));
    }
}