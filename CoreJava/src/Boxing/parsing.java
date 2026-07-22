package Boxing;

public class parsing {
    static void main(String[] args) {
        String str = "10";
        byte a = Byte.parseByte(str);//byte <------ 10 <----------"10"
        short b = Short.parseShort(str);//short <----10<---------"10"
        int c = Integer.parseInt(str);
        long d = Long.parseLong(str);
        float e = Float.parseFloat(str);
        //double d=Double.parseDouble(str);
        //boolean e=Boolean.parseBoolean(str);
        char f = str.charAt(0);
        boolean g = Boolean.parseBoolean(str);
        boolean h = Boolean.parseBoolean(str);//false<---"10"
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
