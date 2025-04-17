package Incepatori;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Cla {
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

        Function<Integer,Integer> obiect=new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer o) {
                return o*2;
            }
        };

        System.out.println(list.stream().filter(e->e%2==1).map(obiect).reduce(0,(a,b)->a+b));

    }
}