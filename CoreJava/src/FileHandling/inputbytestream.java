package FileHandling;

import java.io.FileOutputStream;

public class inputbytestream {
    static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("/home/ben-10/IdeaProjects/Anush/src/files/anush.txt");
        String data = "I am From Earth";
        byte[] data_bytes = data.getBytes();
        fout.write(data_bytes);
        fout.close();
        System.out.println("Done");
    }
}
