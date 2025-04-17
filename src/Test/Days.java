package Test;

class Zile {
    private int a, b;
    public Zile(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Zile(){

    }
    static {
        System.out.println("salut asta este instance block");
    }
    public static void main(String[] args) {
        Zile adunare = new Zile(1, 2);
        Zile adunare1 = new Zile();
        Zile adunare2 = new Zile(2,4);
        System.out.println(adunare.a + adunare.b);
        System.out.println(adunare2.a + adunare2.b);
    }

}


