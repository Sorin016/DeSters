package DeStiut.Stream.Intermediate_si_Terminali.mapToInts;

import java.util.Arrays;
import java.util.List;

public class SumaDinListaDinInt {
    public static void main(String[] args) {
        List<Integer> list=
                Arrays.asList(1,2,3,4,5,6);
        System.out.println( list.stream().mapToInt(Integer::intValue)
                .sum());
    }
}
