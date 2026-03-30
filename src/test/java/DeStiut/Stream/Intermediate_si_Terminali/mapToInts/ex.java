package DeStiut.Stream.Intermediate_si_Terminali.mapToInts;

import java.util.List;

public class ex {
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );

        int sum = numbers.stream()
                .flatMapToInt(list -> list.stream()
                        .mapToInt(Integer::intValue))
                .sum();
        System.out.println(sum);


    }
}
