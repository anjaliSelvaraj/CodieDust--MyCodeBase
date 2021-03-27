package Algos.ArraysAndStrings.Strings; /**
 * Created by ANJALI on 01/30/17.
 */
/* Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.
 *(Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 */

import java.io.IOException;
import java.util.Scanner;

class URLify {
    String str;
    int actualLength;

    void getLine() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String that can be URLified");
        str = s.nextLine();
        System.out.println("Enter actual length of the string");
        actualLength = s.nextInt();

    }

    int countSpaces(String str) {
        int spaceCount = 0;
        for (int i = 0; i < actualLength; i++)
            if (str.charAt(i) == ' ')
                spaceCount++;
        return spaceCount;
    }

    String urlifyScan(String str) {
        countSpaces(str);
        //calculating the index that can accomodte the actualString
        int spaceCount = countSpaces(str);
        int extendedIndex = actualLength + spaceCount * 2;
        if (str.length() < extendedIndex) {
            System.out.println("String's length should be " + extendedIndex + " to be URLified.");
            return " ";
        }
        char[] strArr = str.toCharArray();//because character cannot be assigned using charAt(); Strings are immutable in Java
        for (int i = actualLength - 1; spaceCount >= 1; i--) {
            if (strArr[i] == ' ') {
                spaceCount--;
                strArr[extendedIndex - 1] = '0';
                strArr[extendedIndex - 2] = '2';
                strArr[extendedIndex - 3] = '%';
                extendedIndex = extendedIndex - 3;
            } else {
                strArr[extendedIndex - 1] = strArr[i];
                extendedIndex--;
            }

        }
        return String.valueOf(strArr);
    }

    String urlify(String str)
    //using builtin function
    {
        return str.replace(" ", "%20");
    }


    public static void main(String[] args) throws IOException {
        System.out.println("***URLify***");
        URLify u = new URLify();

        u.getLine();
        System.out.println(u.urlifyScan(u.str));

    }

}
