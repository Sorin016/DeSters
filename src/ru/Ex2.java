package ru;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Pattern pattern = Pattern.compile("(<.*?>)(.*?)(</.*?>)");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String content = matcher.group(1);
                StringBuilder sb = new StringBuilder(content);
                sb.insert(1, "/");
                String content1 = matcher.group(2);
                if (line.startsWith(content) && line.endsWith(sb.toString())) {
                    System.out.println(content1);
                }
                else if(!(line.startsWith(content)==line.endsWith(sb.toString()))){
                String textOnly = line.replaceAll("<[^>]+>", "");
                System.out.println(textOnly);
                }
                else System.out.println("None");
            }
            testCases--;
        }
    }
}
