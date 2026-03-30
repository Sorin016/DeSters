package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {

        Predicate<Integer> predicates =new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0)
                    return true;
                return false;
            }
        };
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(predicates).forEach(System.out::println);
    }
}
