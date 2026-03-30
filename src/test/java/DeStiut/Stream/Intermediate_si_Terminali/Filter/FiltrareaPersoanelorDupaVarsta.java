package DeStiut.Stream.Intermediate_si_Terminali.Filter;

import java.util.Arrays;
import java.util.List;

public class FiltrareaPersoanelorDupaVarsta {
    public static void main(String[] args) {
        List<Persoane> list= Arrays.asList(
                new Persoane(29,"sorin"),
                new Persoane(27,"adri"));
        list.stream().filter(e->e.getVirsta()>28).
        forEach(System.out::println);
    }
}
class Persoane{
    private int virsta;

    @Override
    public String toString() {
        return "Persoane{" +
                "virsta=" + virsta +
                ", nume='" + nume + '\'' +
                '}';
    }

    private String nume;
    public Persoane(int virsta,String nume){
        this.nume=nume;
        this.virsta=virsta;
    }
    public int getVirsta(){
        return virsta;
    }public String  getNume(){
        return nume;
    }
}
