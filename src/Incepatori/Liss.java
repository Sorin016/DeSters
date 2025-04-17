package Incepatori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Liss {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("sorin");
        numbers.add("sorry");
        numbers.add("low");
        numbers.add("high");
        long n=numbers.stream().filter(e->e.startsWith("s")).count();
        System.out.println(n);
    }
}
