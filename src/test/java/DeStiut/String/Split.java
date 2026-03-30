package DeStiut.String;

public class Split {
    public static void main(String[] args) {
        String s="sorin are cea mai frumoasa sotie";
        String[] ss=s.split(" ");
        String f=String.join(".",ss);
            System.out.println(f);
    }
}
