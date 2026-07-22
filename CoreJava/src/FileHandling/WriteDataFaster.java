package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteDataFaster {
    static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Path:");
        String path = sc.nextLine();
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Enter the Data:");
        String data = sc.nextLine();
        bw.write(data);
        bw.flush();
        bw.close();
    }
}
