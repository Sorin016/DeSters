package DeStiut.MethodReferences;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method2 {
    public static void main(String[] args) {
        String [] s={"sorin","adri","dan","inesa"};
        Arrays.sort(s,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(s));
    }
}
