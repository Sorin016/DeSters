package DeStiut.Stream.Intermediate_si_Terminali.Map;

import java.util.stream.Stream;

public class StringUppercase {
    public static void main(String[] args) {
        Stream.of("sorin","adri").
        map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
