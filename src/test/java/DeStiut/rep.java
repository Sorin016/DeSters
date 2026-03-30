package DeStiut;

import io.cucumber.java.an.E;
import io.cucumber.java.sl.In;
import lombok.Data;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rep {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(6,3,1,5,3);
        list.spliterator().getComparator().reversed();
        list.forEach(System.out::println);
    }
}