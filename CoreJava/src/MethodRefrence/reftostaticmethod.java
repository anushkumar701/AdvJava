package MethodRefrence;

public class reftostaticmethod {
    static void main(String[] args) {
        Remote r = Sony::display;
        r.powerOn();

        Master m = Person1::speaksomething;
        m.speak();
    }
}
