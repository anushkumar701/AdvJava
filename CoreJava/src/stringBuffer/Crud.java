package stringBuffer;

public class Crud {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original :" + sb);//Java
        sb.append("Programming ");
        System.out.println("Append :" + sb);//Java Programming
        //0123456789012345
        sb.insert(5, "Core");
        System.out.println("Insert :" + sb);//Java Core Programming
        //012345678901234567890
        sb.replace(0, 4, "Advanced");
        System.out.println("Replace: " + sb);//Advanced Core Program
        //012345678901234567890
        sb.delete(9, 14);
        System.out.println("Delete:" + sb);   //Advanced Programming
        sb.reverse();
        System.out.println("Reverse:" + sb);
    }
}
