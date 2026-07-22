package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Filereader {
    static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/home/ben-10/IdeaProjects/Anush/src/files/test.txt");
        BufferedReader br = new BufferedReader(fr);
        String read = br.readLine();
        while (read != null) {
            System.out.println(read);
            read = br.readLine();
        }
        br.close();
    }
}
