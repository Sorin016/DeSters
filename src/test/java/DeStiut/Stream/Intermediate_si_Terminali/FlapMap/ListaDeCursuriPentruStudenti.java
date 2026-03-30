package DeStiut.Stream.Intermediate_si_Terminali.FlapMap;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class ListaDeCursuriPentruStudenti {
    public static void main(String[] args) {
        List<Student> students=
                Arrays.asList(
                        new Student("sorin",Arrays.asList("matematica","romana")),
                        new Student("adriana",Arrays.asList("eng","franceza"))
                );
        students.stream().flatMap(e->Arrays.stream(e.getListaCursurilor().toArray()))
                .forEach(System.out::println);
    }
}
@Data
class Student{
    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", listaCursurilor=" + listaCursurilor +
                '}';
    }

    private String nume;
    List<String> listaCursurilor;
    public Student(String nume,List<String> list){
        this.nume=nume;
        this.listaCursurilor=list;
    }
}
