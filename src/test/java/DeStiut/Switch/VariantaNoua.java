package DeStiut.Switch;

public class VariantaNoua {
    public static void main(String[] args) {
        int a = 10;
        String ss  = switch (a) {
            case 10, 12 -> "ceva interesant";
            case 11, 13 -> "11";
            default -> "spune ceva anume";
        };
        System.out.println(ss  );
    }
}
