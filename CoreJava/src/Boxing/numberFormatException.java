package Boxing;

public class numberFormatException {
    static void main(String[] args) {
        String str = "Ten";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Check What u are Storing");
        }
    }
}
