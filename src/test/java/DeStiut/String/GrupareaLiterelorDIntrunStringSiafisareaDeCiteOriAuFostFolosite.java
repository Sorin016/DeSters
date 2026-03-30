package DeStiut.String;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class GrupareaLiterelorDIntrunStringSiafisareaDeCiteOriAuFostFolosite {
    public static void main(String[] args) {
        String s="salut esti foarte bravo, nu te da batut";
        Map<Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))
                map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> m:map.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());
    }
}
