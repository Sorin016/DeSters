package Test;

import java.util.Scanner;

public class Om {
    public Om(){

    }
    public Om(int virsta,String nume,double kg){
        System.out.println(virsta+" "+nume+" "+kg);
    }
    public Om(String virsta,String nume,double kg){
        System.out.println(virsta+" "+nume+" "+kg);
    }
    public void Om(String virsta,String nume,double kg){
        System.out.println(virsta+" "+nume+" "+kg);
    }
    public Om(int virsta,String nume){
        System.out.println(virsta+" "+nume);
    }


    public static void main(String[] args) {
        Om sorinObiect = new Om(28,"sorin",76.1);
        Om elenaObiect = new Om(28,"sorin",0.0);
        Om marinaObiect = new Om(18,"marina");
        Om raduObiect = new Om();
    }
}
