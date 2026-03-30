package DeStiut.Array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]=new int[]{1,24,3,2,5,2,3};
        System.out.println(Arrays.binarySearch( IntStream.of(a).sorted().toArray(),3));
    }
}
