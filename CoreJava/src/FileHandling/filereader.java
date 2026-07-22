package FileHandling;

import java.io.FileReader;

public class filereader {
    static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/home/ben-10/files/anush.txt");
        int asci = fr.read();
        while (asci != -1) {
            System.out.print((char) asci);
            asci = fr.read();
        }
        fr.close();
    }
}
