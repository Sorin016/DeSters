package DeStiut.String;

public class FromStringTOCharArray {
    public static void main(String[] args) {
        String n="salut ce minunat este";
        char[] s=n.toCharArray();
        for(char ss:s){
            System.out.print(ss+" ");
        }
    }
}
