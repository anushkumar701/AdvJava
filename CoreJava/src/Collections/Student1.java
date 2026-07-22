package Collections;

class Student1 implements Comparable<Student>{
    int id;
    String name;
    double marks;

    public Student1(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        if(this.id < s.id){
            return -1;
        } else if (this.id > s.id) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

