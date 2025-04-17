package Incepatori;

interface FirstInterface {
    String nume();
}

abstract class cls {
    abstract String prenume();
}

class DemoClass extends cls implements FirstInterface {
    DemoClass demoClass = new DemoClass();

    @Override
    public String nume() {
        return "sorin";
    }

    @Override
    String prenume() {
        return "cuce";
    }

    public void add() {
        System.out.println(demoClass.nume()+" "+demoClass.prenume());
    }
}

public class TemaPeAcasa  {
    public static void main(String[] args) {
        DemoClass demoClass1 = new DemoClass();
        demoClass1.add();
    }
}

