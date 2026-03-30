package DeStiut.Map;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefault {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sorin", 1);
        map.put("adri", 2);
        int a = (map.getOrDefault("sorin", 0));
        System.out.println(a);
    }
}
