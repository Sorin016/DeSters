package DeStiut.Recursia;

public class StringInvers {
    public static void main(String[] args) {
        System.out.println(invers("sorin"));
    }
    static String invers(String s){
        if(s.length()==1)
            return s;
        return s.charAt(s.length()-1)+invers(s.substring(0,s.length()-1));
    }
}
