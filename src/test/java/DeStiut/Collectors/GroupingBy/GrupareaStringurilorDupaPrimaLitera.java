package DeStiut.Collectors.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupareaStringurilorDupaPrimaLitera {
    public static void main(String[] args) {
        List<String > list= Arrays.asList("sorin","sudan","sare","ada","ala");
        Map<Character,List<String >> map=
                list.stream().collect(Collectors.groupingBy(e->e.charAt(0)));
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
