package DeStiut.Stream.Intermediate_si_Terminali.Map;

import java.util.stream.Stream;

public class TransformaStringInInteger {
    public static void main(String[] args) {
        Stream.of("1","2","3")
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
