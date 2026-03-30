package DeStiut.Stream.Intermediate_si_Terminali.peek;

import java.util.stream.Stream;

public class PentruDebugging {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).
                peek(System.out::println)
                .map(e->e+=1).forEach(System.out::println);
    }
}
