package DeStiut.Recursia;

public class Combinatorica {
    static int c=0;
    public static void main(String[] args) {
        String s="ABC";
        int n=4;
        ss(s,n,"");
    }
    static void ss(String s, int n, String cuv) {
        if (cuv.length() == n) {
            c++;
            System.out.println(c+" "+cuv);
            return;
        }
        for (int i = 0; i < s.length(); i++)
            ss(s, n, cuv + s.charAt(i));
    }
}
