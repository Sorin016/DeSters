package DeStiut.Collectors.GroupingBy;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GruparePlusCounting {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("sorin","sorin","dan","adri");
        Map<String, Long>map=
                list.stream()
                        .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("***************");
        List<Integer> lists= Arrays.asList(1,1,2,2,3,4,5);
        Map<Integer,Long> map1=
                lists.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        map1.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
