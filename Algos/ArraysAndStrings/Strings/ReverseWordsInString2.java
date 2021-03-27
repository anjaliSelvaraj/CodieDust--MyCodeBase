package Algos.ArraysAndStrings.Strings;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/6/2017.
 */
public class ReverseWordsInString2 {
    /*Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
    The input string does not contain leading or trailing spaces and the words are always separated by a single space.
    For example,
    Given s = "the sky is blue",
return "blue is sky the".
    Could you do it in-place without allocating extra space?*/

    private String[] myReverseWords(String line) {
        String[] words = line.split(" ");
        String temp;
        for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) {
             /*
             an in-place algorithm is an algorithm which transforms input using no auxiliary data structure.
             However a small amount of extra storage space is allowed for auxiliary variables.
              */

            temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        return words;
    }

    void reverseWords(char[] s) {
        //Three step to reverse
        // 1, reverse the whole sentence
        reverse(s, 0, s.length - 1);
        // 2, reverse each word
        int start = 0;
        //int end = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
        // 3, reverse the last word, if there is only one word this will solve the corner case
        reverse(s, start, s.length - 1);
    }

    public void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        ReverseWordsInString2 rs = new ReverseWordsInString2();
        System.out.println("***REVERSE THE WORDS IN THE STRING***");
        String[] words = rs.myReverseWords(new Inputs().getALine());
        for (String s : words)
            System.out.print(s + " ");
    }
}
