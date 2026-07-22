public class Oddnum {
    static void main(String[] args) {
        int i = 1;
        while (i < 51) {
            if (i == 2)
                System.out.print(i);
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }
}
