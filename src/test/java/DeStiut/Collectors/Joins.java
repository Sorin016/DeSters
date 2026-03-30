package DeStiut.Collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Joins {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println( ll.stream().
                map(String::valueOf).collect(Collectors.joining("< >")));

    }
}
