package Test;

public class Main {
    static String nume(String nume) {
        return nume;
    }

    static String prenume(String prenume) {
        return prenume;
    }

    static double add(double a, int b) {
        return a - b;
    }

    static double add(int b, double a) {
        return a * b;
    }

    public static void main(String[] args) {
//        String nume = nume("sorinuss");
//        String prenume = prenume("cuce");
//        System.out.println(nume+prenume);
        System.out.println(nume("sorinuss") + prenume(" cuce"));
        System.out.println(add(1,2.7));
    }
}