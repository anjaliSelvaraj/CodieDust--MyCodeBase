package Algos.ArraysAndStrings.Strings;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/2/2017.
 */
public class FirstUniqueCharacter {

    /* Given a string, find the first non-repeating character in it and return it's index.
    If it doesn't exist, return -1.
Examples:
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.
     */
    private int firstUniq(String str) {
        int[] freq = new int[26];
        int i;
        for (i = 0; i<str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (i = 0; i< str.length(); i++)
            if (freq[str.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

    public static void main(String args[]) {
        FirstUniqueCharacter fc = new FirstUniqueCharacter();
        System.out.println("***FIRST UNIQUE CHARACTER***");
        System.out.println(fc.firstUniq(new Inputs().getAString()));
    }
}