package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int sid;
    String sname;
    transient double marks;

    public Student(int sid, String sname, double marks) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return sid + ":" + sname + ":" + marks + ":";
    }
}

class serializable {
    static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("/home/ben-10/IdeaProjects/Anush/src/files/student.txt");
        ObjectOutputStream obj_out = new ObjectOutputStream(fout);
        obj_out.writeObject(new Student(1, "Anush", 123.456));
        obj_out.close();
        fout.close();
        System.out.println("Done");
    }
}
