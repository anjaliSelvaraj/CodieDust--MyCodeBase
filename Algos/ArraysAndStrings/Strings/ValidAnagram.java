package Algos.ArraysAndStrings.Strings;

import Utilities.Services.Inputs;

import java.util.Arrays;

/**
 * Created by ANJALI on 6/2/2017.
 */
public class ValidAnagram {
    String str1,str2;
    /*Given two strings s and t, write a function to determine if t is an anagram of s.
    For example,
    s = "anagram", t = "nagaram", return true.
    s = "rat", t = "car", return false*/

    boolean isAnagram(char[] str1,char[] str2){
        Arrays.sort(str1);
        Arrays.sort(str2);
    return new AllAnagrams().isCharArrayEqual(str1, str2);
    }

public static void main(String args[]){
    ValidAnagram va=new ValidAnagram();
    va.str1=(new Inputs()).getAString();
    va.str2=(new Inputs()).getAString();
    va.isAnagram(va.str1.toCharArray(),va.str2.toCharArray());
}
}
