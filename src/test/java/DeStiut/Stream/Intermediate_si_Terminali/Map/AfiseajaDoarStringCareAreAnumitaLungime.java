package DeStiut.Stream.Intermediate_si_Terminali.Map;

import java.util.stream.Stream;

public class AfiseajaDoarStringCareAreAnumitaLungime {
    public static void main(String[] args) {
        Stream.of("sorin","adri",
                "marusea","violeta","natalia","ana")
                .map(String::length)
                .filter(e->e>4)
                .forEach(System.out::println);
    }
}
