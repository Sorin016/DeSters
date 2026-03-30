package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.Arrays;
import java.util.List;

public class FiltrareStringDupaLungime {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "sorin","adri","dan","maria","tamara");
        list.stream().filter(e->e.length()>3).forEach(
                System.out::println
        );

    }
}