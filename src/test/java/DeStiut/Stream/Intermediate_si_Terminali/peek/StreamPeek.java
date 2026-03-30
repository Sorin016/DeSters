package DeStiut.Stream.Intermediate_si_Terminali.peek;

import java.util.stream.Stream;

public class StreamPeek {
    public static void main(String[] args) {
        Stream.of(1,2,3,4).
        peek(System.out::print)
                .map(e->e%2==0)
                .forEach(System.out::println);
    }
}
