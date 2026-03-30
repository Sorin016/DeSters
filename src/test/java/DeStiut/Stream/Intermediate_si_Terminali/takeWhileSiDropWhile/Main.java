package DeStiut.Stream.Intermediate_si_Terminali.takeWhileSiDropWhile;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .takeWhile(e->e<4)
                .forEach(System.out::println);
        System.out.println("***");
        Stream.of(1,2,3,4,5)
                .dropWhile(e->e<4)
                .forEach(System.out::println);

        System.out.println("******");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .dropWhile(e->e<4).limit(4)
                .forEach(System.out::println);
    }
}
