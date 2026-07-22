package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class decerlization {
    static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("/home/ben-10/IdeaProjects/Anush/src/files/student.txt");
        ObjectInputStream obj_in = new ObjectInputStream(fin);
        Object serializable = obj_in.readObject();
        fin.close();
        obj_in.close();
        System.out.println("Done");
    }
}


