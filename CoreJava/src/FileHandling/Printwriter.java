package FileHandling;

import java.io.PrintWriter;

public class Printwriter {
    static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("/home/ben-10/files/anush.txt");
        pw.println("hey i am Ben 10");
        pw.println("Na dha Gwen");
        pw.close();
        System.out.println("Done");
    }
}
