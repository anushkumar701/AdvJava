package RelationShip;

interface Dinga {
    void singer();
}

interface Mangi {
    void dancer();
}

class MultiInheritanceusingInterface implements Dinga, Mangi {
    static void main(String[] args) {
        MultiInheritanceusingInterface ref = new MultiInheritanceusingInterface();
        ref.singer();
        ref.dancer();
    }

    @Override
    public void singer() {
        System.out.println("I am singer like my father");
    }

    @Override
    public void dancer() {
        System.out.println("I am dancer like my MOther");
    }
}

