package DeStiut.String;

import io.cucumber.java.it.Ma;
import io.cucumber.java.sl.In;

import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.graph.ElementOrder.sorted;

public class CelMaiUtilizataLitera {
    public static void main(String[] args) {
        String s = "sorin o sa se primeasca";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        List<Map.Entry<Character, Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.stream().forEach(System.out::println);
        list.stream().sorted(Map.Entry.<Character, Integer>comparingByValue()
                .reversed())
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
