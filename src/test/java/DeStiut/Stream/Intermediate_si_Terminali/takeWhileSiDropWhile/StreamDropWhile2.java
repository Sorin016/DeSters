package DeStiut.Stream.Intermediate_si_Terminali.takeWhileSiDropWhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDropWhile2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2);

        List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 4).toList();
        result.forEach(System.out::println);

    }
}
