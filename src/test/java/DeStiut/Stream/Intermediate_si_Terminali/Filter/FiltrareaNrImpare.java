package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.Arrays;
import java.util.List;

public class FiltrareaNrImpare {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().filter(e->e%2==1).forEach(System.out::println);
    }
}
