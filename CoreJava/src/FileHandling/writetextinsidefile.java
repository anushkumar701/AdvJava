package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class writetextinsidefile {
    static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Path:");
        FileWriter fw = new FileWriter(sc.nextLine());
        String data = sc.nextLine();
        fw.write(data);
        fw.flush();
        fw.close();
        System.out.println("Done");
    }
}
