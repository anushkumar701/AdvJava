package object_class;

class FinalizeMethod {

    String dept_name;

    public FinalizeMethod(String dept_name) {

        this.dept_name = dept_name;

        System.out.println(dept_name + " Department Created");
    }

    static void main(String[] args) {

        FinalizeMethod f1 = new FinalizeMethod("CSE");
        FinalizeMethod f2 = new FinalizeMethod("IT");
        FinalizeMethod f3 = new FinalizeMethod("ECE");
        f2 = null;
        f3 = null;
        System.gc();
        System.out.println("done");
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println(dept_name + " is Destroyed");
    }
}