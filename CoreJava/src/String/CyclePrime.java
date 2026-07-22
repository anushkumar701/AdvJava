package String;

public class CyclePrime {
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCyclicPrime(String str) {
        for (int i = 1; i <= str.length(); i++) {
            int number = Integer.parseInt(str);
            if (!isPrime(number))
                return false;
            char digit = str.charAt(0);
            str = str.substring(1) + digit;
        }
        return true;
    }

    static void main(String[] args) {
        String str = "1193";
        System.out.println(isCyclicPrime(str));
    }
}
