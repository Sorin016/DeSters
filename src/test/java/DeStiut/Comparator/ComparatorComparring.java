package DeStiut.Comparator;

import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparring {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(new Student(11,"sorin"),new Student(10,"adri")
                ,new Student(13,"dan"),new Student(11, "ana"),new Student(13,"anabeli"),
                new Student(12,"adriana"));
        Comparator<Student> comparator=Comparator.comparing(Student::getNume).reversed();
        Collections.sort(list,comparator);
        list.forEach(System.out::println);
    }
}
@Data
class Student{
    int age;
    String nume;
    Student(int age, String nume){
        this.age=age;
        this.nume=nume;
    }
}