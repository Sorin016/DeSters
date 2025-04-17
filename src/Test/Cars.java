package Test;

public class Cars {
    public Cars(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        Persons persons=new Persons();
        Cars cars=new Cars();
        persons.add(1,2,3);
        persons.display();
        persons.show();
    }

}
interface First{
    void add(int a, int b, int c);
    void show();
}
interface Second extends First{
    void display();
}
class Persons implements Second{

    @Override
    public void display() {
        System.out.println("nume"+" prenume");
    }

    @Override
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    @Override
    public void show() {
        System.out.println("ceva");
    }
}
