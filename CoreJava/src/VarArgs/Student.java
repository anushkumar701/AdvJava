package VarArgs;

class Stud {
    int sid;
    String name;
    double marks;

    Stud(int sid, String name, double marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public static void printFailedStudents(Stud... s) {
        for (Stud i : s) {
            if (i.marks < 35)
                i.details();
        }
    }

    public void details() {
        System.out.println("Id-" + sid + ":" + name + ":" + marks);
    }
}

public class Student {
    static void main(String[] args) {
        Stud s1 = new Stud(1, "Sandhiya", 86);
        Stud s2 = new Stud(1, "Anush", 81);
        Stud s3 = new Stud(1, "Hari", 86);
        Stud s4 = new Stud(1, "Sharan", 86);

        Stud.printFailedStudents(s1, s2, s3, s4);
    }
}