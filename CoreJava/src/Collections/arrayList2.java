//WAJP to print student details who is havig marks greater than 25


package Collections;

import java.util.ArrayList;
import java.util.Arrays;

class Student{
    int id;
    String name;
    double marks;

    public Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class arrayList2 {
    static void main(String[] args) {
        Student s1=new Student(5,"Hari",56);
        Student s2=new Student(3,"Sharan",76);
        Student s3=new Student(1,"Anush",66);
        Student s4=new Student(2,"Sandhiya",45);

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        for (Student s : al){
            if(s.marks >= 60)
                System.out.println(s);
        }
    }
}
