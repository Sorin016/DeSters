package DeStiut.Stream.Intermediate_si_Terminali.FlapMap;

import java.util.Arrays;
import java.util.List;

public class AfisareaListei {
    public static void main(String[] args) {
        List<List<String>>list= Arrays.asList(
                Arrays.asList("banane","morcov"),
                Arrays.asList("mere","pere")
        );
        list.stream().flatMap(List::stream)
                .forEach(System.out::println);
    }
}
