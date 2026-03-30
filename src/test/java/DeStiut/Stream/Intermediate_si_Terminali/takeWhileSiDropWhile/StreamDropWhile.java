package DeStiut.Stream.Intermediate_si_Terminali.takeWhileSiDropWhile;

import java.util.stream.Stream;

public class StreamDropWhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).dropWhile(n->n>2).forEach(e-> System.out.println(e));
    }
}
