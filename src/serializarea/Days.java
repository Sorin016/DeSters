package serializarea;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Days {
    private String name="Sorin";
    static int age=28;
    public static void main(String[] args) {
        int result=multyplyBy3(3);
        System.out.println(result);
        Days days=new Days();
        System.out.println(Days.age);
        System.out.println(days.name);
        System.out.println(days.devideBy3(result));
    }
    public static int multyplyBy3(int i){
        return i*=3;
    }
    public int devideBy3(int i){
        return i/=3;
    }
}









