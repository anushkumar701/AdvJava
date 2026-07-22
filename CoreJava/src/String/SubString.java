package String;

/*
MethodName                  returnType              Purposes
substring(start,end)         String                 Provide the String Based On Mention Index
 */


public class SubString {
    static void main(String[] args) {
        String s = "Sandhiya";
        System.out.println(s.substring(0, 6));
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(1, 6));
    }
}
/*
Sandhi
Sandh
andhi
*/