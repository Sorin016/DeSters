package DeStiut.Stream.Intermediate_si_Terminali.Map;



import lombok.Data;

import java.util.stream.Stream;

public class ExtragiDoarNumeleDintroClasa {
    public static void main(String[] args) {
        Stream.of(new Persoane(29,"sorin"),
                new Persoane(27,"adriana"))
                .map(Persoane::getNume).forEach(System.out::
                println);
    }
}

class Persoane{
    @Override
    public String toString() {
        return "Persoane{" +
                "virsta=" + virsta +
                ", nume='" + nume + '\'' +
                '}';
    }

    private int virsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVirsta() {
        return virsta;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }

    private String nume;

    public Persoane(int virsta, String nume) {
        this.virsta = virsta;
        this.nume = nume;
    }
}