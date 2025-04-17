package Test;

public class Person {
    public Person(){

    }
    public Person(String name){
        System.out.println(name);
    }
    public Person(String name,String lastName){
        System.out.println(name.concat(" "+lastName));
    }
    static {
        System.out.println(28);
    }
}
