package stringBuffer;

public class StringBuffers {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//StringBuffer Obj created mwans 16 memory allocated
        System.out.println(sb.capacity());//16
        sb.append("12345678901234567");//Once we add more than 16 it will create new Array
        //(Current Capacity*2)+2
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//17
    }
}
