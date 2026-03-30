package DeStiut.String;

public class FromCharToString {
    public static void main(String[] args) {
        char[] a={'a','b','c'};
        String ss=String.copyValueOf(a);
        String m=ss.replaceAll(""," ");
        System.out.println(m);
    }
}
