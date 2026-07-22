package OOPS;

public class p3 {
    static boolean my_feeling = true;

    static {
        System.out.println("I am MLSi from B");
    }

    {
        System.out.println("toxic");
    }

    static void main(String[] args) {
        System.out.println("KGF 1");
        System.out.println(p2.favourite_movie);
        System.out.println("KGF 2");
        System.out.println(p2.favourite_movie);
        System.out.println(my_feeling);
        System.out.println(p3.my_feeling);
    }
}
