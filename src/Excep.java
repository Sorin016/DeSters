import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Excep extends Thread {

    public static void main(String[] args) {
        List<List<Persoane>> list = Arrays.asList(
                Arrays.asList(
                        new Persoane("sorin", "crosetat"),
                        new Persoane("denis", "gaming"),
                        new Persoane("tudor", "gaming")),
                Arrays.asList(
                        new Persoane("felicia", "medicina")),
                Arrays.asList(
                        new Persoane("david", "hike"),
                        new Persoane("marioara", "foto"),
                        new Persoane("nicu ", "foto"),
                        new Persoane("adriana ", "foto"),
                        new Persoane("adriana ", "hike"))
        );

        Map<String, List<Persoane>> spune = list.stream()
                .flatMap(n -> n.stream()).collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(Persoane::getHoby));

        Map<String, Long> hobbyCount = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Persoane::getHoby, Collectors.counting()));

        spune.forEach((m, n) -> System.out.println(m + " "
                + n.stream().map(Persoane::getNume).collect(Collectors.toList())
                + " " + hobbyCount.get(m)));
    }
}


class Persoane {
    String nume;

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    String hoby;

    @Override
    public String toString() {
        return "Persoane{" +
                "nume='" + nume + '\'' +
                ", hoby='" + hoby + '\'' +
                '}';
    }


    public Persoane(String nume, String hoby) {
        this.nume = nume;
        this.hoby = hoby;
    }
}
