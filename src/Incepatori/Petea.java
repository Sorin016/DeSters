package Incepatori;

abstract class Eden {
    abstract public void add();
    int a = 10;
}

class Mar extends Eden {
    int b = 10;

    @Override
    public void add() {
        System.out.println(a + b);
    }
}
class Petea {
    public static void main(String[] args) {
        Mar objMar = new Mar();
        objMar.add();
    }
}

