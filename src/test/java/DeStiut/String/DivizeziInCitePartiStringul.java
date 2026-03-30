package DeStiut.String;

import java.util.ArrayList;
import java.util.List;

public class DivizeziInCitePartiStringul {
    public static void main(String[] args) {
        String s = "sorins4";
        System.out.println(divizarea(s, 3));
    }

    public static List<String> divizarea(String s, int size) {
        List<String> list = new ArrayList<>();
        if (s.length() % size != 0)
            throw new IllegalArgumentException("nu se imparte stringul dumitale");
        for (int i = 0; i < s.length(); i += size) {
            list.add(s.substring(i, i + size));
        }
        return list;
    }
}
