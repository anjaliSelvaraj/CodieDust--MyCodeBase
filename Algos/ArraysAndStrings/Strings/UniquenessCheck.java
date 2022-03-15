package Algos.ArraysAndStrings.Strings; /**
 * Created by ANJALI on 01/30/17.
 */

/*Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures
 *
 * Assumptions:
 * 1.
 */

// implement using hashmap

import java.util.Arrays;
import java.util.Scanner;

class UniquenessCheck {
    boolean isUniqueChar(String str) {
        int strt = 0;
        while (strt < str.length()) {
            for (int i = strt + 1; i < str.length(); i++) {  // just comparing every character with other characters in the string
                if (str.charAt(i) == str.charAt(strt)) {
                    return false;
                }
            }
            strt++;
        }
        return true;
    }

    boolean isUniqueChars(String str) {
        //sorting the characters of the string and check if any any character occurs twice.
        Arrays.sort(str.toCharArray());
        for (int strt = 0, next = 1; next < str.length(); strt++, next++) {
            if (str.charAt(strt) == str.charAt(next))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UniquenessCheck iu = new UniquenessCheck();

        System.out.println("Enter a string");

        String str = s.next();
        System.out.println(str + " is " + iu.isUniqueChar(str) + " in isUniqueChar");

        System.out.println(str + " is " + iu.isUniqueChars(str) + " in isUniqueChars");

    }

}
