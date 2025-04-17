package ru;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HakecerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        for (int i = 0; i < nr; i++) {
            try {
                long n = scan.nextLong();
                System.out.print(n + " can be fitted in:\n");
                if (n >= -128 && n <= 127) {
                    System.out.println("*byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("*short");
                }
                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("*int");
                }
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    System.out.println("*long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
