package DeStiut.MethodReferences;

import io.cucumber.java.sl.In;

import java.util.function.Consumer;

public class Method1 {
    public static void main(String[] args) {
        Consumer<String> ss=Eden::afis;
        ss.accept("salut");
    }
}
class Eden{
     static void afis(String s){
        System.out.println(s);
    }
}