package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.Objects;
import java.util.stream.Stream;

public class EliminareaDinListaAValorilorNull {
    public static void main(String[] args) {
        Stream.of("Sorin","Dan",null,"Adri","Tamara").
    filter(Objects::nonNull).forEach(System.out::println);
    }
}
