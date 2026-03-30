package DeStiut.String;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValoareaDinStrinCareSeRepeta {
    public static void main(String[] args) {
        String ss="salults";
        int count=0;
        char[]c=ss.toCharArray();
        for(int i=0;i<ss.length();i++){
            for(int j=i+1;j<ss.length();j++){
                if(c[i]==c[j]){
                    count++;
                    System.out.println(c[i]+" "+count);
                }
            }
        }
        System.out.println("*********");
        Map<Character, Integer> map=new HashMap<>();
        for(char cs:ss.toCharArray()) {
            if (Character.isLetter(cs)) {
                map.put(cs, map.getOrDefault(cs, 0) + 1);
            }
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.forEach(System.out::println);

    }//mai bine foloseste map pentru asta
}
