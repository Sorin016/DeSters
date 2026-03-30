package DeStiut.Stream.Intermediate_si_Terminali.FlapMap;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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

class Student{
    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", listaCursurilor=" + listaCursurilor +
                '}';
    }

    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getListaCursurilor() {
        return listaCursurilor;
    }

    public void setListaCursurilor(List<String> listaCursurilor) {
        this.listaCursurilor = listaCursurilor;
    }

    List<String> listaCursurilor;
    public Student(String nume,List<String> list){
        this.nume=nume;
        this.listaCursurilor=list;
    }
}
