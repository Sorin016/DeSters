package DeStiut.Array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DublareaCifrelor2 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 1, 2, 3, 4, 5, 6};
        int b[] = IntStream.of(a).sorted().distinct().toArray();
    }
}
