package DeStiut.Stream.Intermediate_si_Terminali.mapToInts;

import java.util.stream.Stream;

public class MinsiMaxsiAvg {
    public static void main(String[] args) {
        System.out.println( Stream.of(1,2,3,4,5)
                .mapToInt(Integer::intValue).min().getAsInt());

        System.out.println( Stream.of(1,2,3,4,5)
                .mapToInt(Integer::intValue).max().getAsInt());

        System.out.println( Stream.of(1,2,3,4,5)
                .mapToInt(Integer::intValue).average().getAsDouble());
    }
}
