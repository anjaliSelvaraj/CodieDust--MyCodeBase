package Algos.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ANJALI on 2/28/2017.
 */

/*Group Anagrams: Write a method to sort an array of strings so that all the anagrams are next to each other.
ANAGRAM: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
 */

//Logic: if two strings are anagrams, they should be same after sorting the characters in it.
class GroupAnagrams {
    //The following is the data structure in which a map holds a string value as key and the corresponding values of a key are stored in the arraylist
    private final HashMap<String, ArrayList<String>> sortedAnag = new HashMap<>();
    private String[] str;

    private void groupAnagramsInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        str = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++)
            str[i] = s.next();
    }

    private void groupAnagrams() {
        for (String s : str) {
            char[] charsSorted = s.toCharArray();
            Arrays.sort(charsSorted);
            String key = String.valueOf(charsSorted);
            /*
            the string after sorting their respective characters is used as the key,
            so that when its anagram is found, they can be entered into the arraylist
             */

            if (sortedAnag.containsKey(key))
                (sortedAnag.get(key)).add(s);
            /*       This method returns the arraylist.
            If the key already exists,add the actual string to the already existing arraylist.

            According to the property of hashmap, when a duplicate key is encountered, the value of that key is over written by the recent value.
            but here we want to preserve those values to sort them.
            therefore we check this condition.
             */
            else {
                ArrayList<String> stringList = new ArrayList<>();
                stringList.add(s);
                sortedAnag.put(key, stringList);
            }
        }
        int index = 0;
        for (String keys : sortedAnag.keySet()) {
            for (String s : sortedAnag.get(keys)) {
                str[index] = s;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        ga.groupAnagramsInput();
        ga.groupAnagrams();
        for (String s : ga.str)
            System.out.print(s + "\t");

    }


}
