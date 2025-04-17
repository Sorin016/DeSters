package Incepatori;

class Laptop extends Calculator{
    String denumireaLaptop = "lenovo";

    public static void main(String[] args) {
        Laptop obj=new Laptop();
        System.out.println(obj.denumireaLaptop);
        obj.afisareCostului();
        System.out.println(obj.viteza);
    }
}

