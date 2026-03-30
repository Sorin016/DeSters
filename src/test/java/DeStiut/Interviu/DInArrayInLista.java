package DeStiut.Interviu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DInArrayInLista {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4};
        List<Integer> list= Arrays.asList(a);
        list.forEach(System.out::print);
        System.out.println();
        System.out.println("****");
        int b[]={5,6,7};
        List<Integer> ss=new ArrayList<>();
        for(int i=0;i<b.length;i++)
            ss.add(b[i]);
        ss.forEach(System.out::print);
    }
}
