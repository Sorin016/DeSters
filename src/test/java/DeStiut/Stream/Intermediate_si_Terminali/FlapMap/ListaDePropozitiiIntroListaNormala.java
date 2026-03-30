package DeStiut.Stream.Intermediate_si_Terminali.FlapMap;

import java.util.Arrays;
import java.util.List;

public class ListaDePropozitiiIntroListaNormala {
    public static void main(String[] args) {
        List<String> list=
                        Arrays.asList("salut ","esti","cel mai frumos");
     list.stream().
                flatMap(e->Arrays.stream(e.split(",")))
                .forEach(System.out::print);
    }
}
