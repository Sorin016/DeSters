package DeStiut.Collectors.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBys {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<String,List<Integer>> map=
                list.stream().collect(Collectors.
                        groupingBy(e->e%2==0?"par ":"Impar"));
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
