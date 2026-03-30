package DeStiut.Stream.Intermediate_si_Terminali.mapToInts;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class SumaDinObiecteCustoms {
    public static void main(String[] args) {
        List<Custom> list
                = Arrays.asList(new Custom(200),
                new Custom(300),
                new Custom(400));
        System.out.println( list.stream().mapToInt(Custom::getPret)
                .sum());
    }
}

class Custom{
    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    private int pret;
    public Custom(int pret){
        this.pret=pret;
    }
}
