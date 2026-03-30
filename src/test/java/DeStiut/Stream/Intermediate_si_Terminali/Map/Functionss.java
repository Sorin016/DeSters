package DeStiut.Stream.Intermediate_si_Terminali.Map;

import java.util.function.Function;
import java.util.stream.Stream;

public class Functionss {
    public static void main(String[] args) {
        Function<Integer,Integer> function=
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                      return integer*integer;
                    }
                };
        Stream.of(1,2,3,4,5,6)
                .map(function)
                .forEach(System.out::println);
    }
}
