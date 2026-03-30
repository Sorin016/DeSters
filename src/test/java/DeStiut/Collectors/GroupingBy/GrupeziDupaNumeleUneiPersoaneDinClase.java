package DeStiut.Collectors.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupeziDupaNumeleUneiPersoaneDinClase {
        public static void main(String[] args) {

            List<Persoana> persoane = Arrays.asList(
                    new Persoana("Ana",20),
                    new Persoana("Ion",30),
                    new Persoana("Maria",20)
            );

            Map<Integer,List<Persoana>> map=
                    persoane.stream().
                            collect(Collectors.groupingBy(Persoana::getVarsta));
            map.forEach((k,v)-> System.out.println(k+" "+v));
        }
    }
    class Persoana {

        @Override
        public String toString() {
            return "Persoana{" +
                    "nume='" + nume + '\'' +
                    ", varsta=" + varsta +
                    '}';
        }

        String nume;
        int varsta;

        Persoana(String nume, int varsta){
            this.nume = nume;
            this.varsta = varsta;
        }

        public int getVarsta(){
            return varsta;
        }

        public String getNume(){
            return nume;
        }
    }

