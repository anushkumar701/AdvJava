package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class r_w_CharacterStream {
    static void main(String[] args) throws Exception {
        //To Write
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/ben-10/IdeaProjects/Anush/src/files/test.txt"));
        bw.write("Hello");
        bw.newLine();
        bw.write("Hello bro");
        bw.close();
        System.out.println("Done");
        //To read
        BufferedReader br = new BufferedReader(new FileReader("/home/ben-10/IdeaProjects/Anush/src/files/test.txt"));
        String rd = br.readLine();
        while (rd != null) {
            System.out.println(rd);
            rd = br.readLine();
        }
        br.close();
    }
}
