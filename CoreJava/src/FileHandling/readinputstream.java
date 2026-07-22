package FileHandling;

import java.io.FileInputStream;

public class readinputstream {
    static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("/home/ben-10/IdeaProjects/Anush/src/files/anush.txt");
        byte[] data = fin.readAllBytes();
        for (byte i : data)
            System.out.print((char) i);
    }
}
