package serializarea;

import com.sun.source.tree.PatternTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class ssd{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern1));
        }
    }
}
class MyRegex{
   // 2001:0db8:85a3:0000:0000:8a2e:0370:7334
    //    000.12.12.034
    String pattern = "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$";
    String pattern1 = "^(([0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]" +
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]" +
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"+
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"+
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"+
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"+
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"+
            "[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z])\\:)$";

}

