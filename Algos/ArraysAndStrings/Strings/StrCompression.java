package Algos.ArraysAndStrings.Strings; /**
 * Created by ANJALI on 01/30/17.
 */

/* Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a -z)
 */

import java.io.IOException;
import java.util.Scanner;

class StrCompression {
    String getString() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string to compress");
        String str = s.next() + " ";
        return str;
    }

    String compress(String str) {
        int c = 0;
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            strb.append(str.charAt(i));
            c = 1;
            while (str.charAt(i) == str.charAt(i + 1)) {
                c++;
                i++;
            }
            strb.append(c);
        }
        return strb.toString();
    }

    void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException {
        String str;
        StrCompression sc = new StrCompression();
        System.out.println("***STRING COMPRESSION***");
        str = sc.getString();
        String afterCompression = sc.compress(str);
        sc.print(afterCompression);
    }
}
