package DeStiut.Stream.Intermediate_si_Terminali.takeWhileSiDropWhile;

import java.util.stream.Stream;

public class StreamTakeWhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6).takeWhile(n->n>3).forEach(e-> System.out.println(e));
    }
}
