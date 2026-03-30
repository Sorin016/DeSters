package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.stream.Stream;

public class FiltruFiltru {
    public static void main(String[] args) {
        Stream.of("sorin","adriana","maria",
                "vlada","marusea").filter(e->e.startsWith("m"))
                .filter(e->e.length()>5)
                .forEach(System.out::println);
    }
}
