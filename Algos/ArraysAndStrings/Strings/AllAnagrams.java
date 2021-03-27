package Algos.ArraysAndStrings.Strings;

import Utilities.Services.Inputs;

import java.util.Arrays;

/**
 * Created by ANJALI on 6/1/2017.
 */
public class AllAnagrams
    /*
    Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.
Example 1:
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

     */ {

    void findAllAnagrams(String given, String another) {
        char[] subStringGiven = new char[another.length()];
        char[] anotherCopy = another.toCharArray();

        Arrays.sort(anotherCopy);

        int index = 0;
        for (int i = 0; i + another.length() < given.length(); i++) {
            for (int j = i; index < another.length(); j++) {
                subStringGiven[index] = given.charAt(j);
                index++;
            }
            index = 0;
            Arrays.sort(subStringGiven);
            if (isCharArrayEqual(subStringGiven, anotherCopy))
                System.out.println(i);
        }


    }

    public boolean isCharArrayEqual(char[] first, char[] second) {
        for (int i = 0; i < first.length; i++)
            if (first[i] != second[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        AllAnagrams aa = new AllAnagrams();
        System.out.println("***FIND ALL THE ANAGRAMS OF A STRING IN ANOTHER***");
        aa.findAllAnagrams(new Inputs().getAString(), new Inputs().getAString());

    }

}
