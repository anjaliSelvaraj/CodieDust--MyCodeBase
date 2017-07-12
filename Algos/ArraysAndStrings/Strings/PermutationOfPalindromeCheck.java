package Algos.ArraysAndStrings.Strings; /**
 * Created by ANJALI on 01/30/17.
 */

import java.util.Hashtable;
import java.util.Scanner;

/*
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE Input: Tact Coa Output: True (permutations: "taco cat'; "atco eta·; etc.)
 */

 class PermutationOfPalindromeCheck {
    String str="";
    void getAString(){
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String[] given=(s.nextLine()).split(" ");
        for(String i:given)
            str=str+i;
    }
   public boolean isEven(int num)
    {
        return num % 2 == 0;
    }
    boolean isPermutationOfAPalindrome(String str)
    {
        Hashtable<Character,Integer> counter=new Hashtable<Character,Integer>();
        for(char c:str.toCharArray())
            if(counter.containsKey(c))
                counter.put(c,counter.get(c)+1);
            else
                counter.put(c, 1);

          int odd=0;
            for(int i: counter.values())
                if(!isEven(i))
                {
                    odd++;
                    if(odd>1)
                        return false;
                }

        return true;

    }
    public static void main(String args[])
    {
        PermutationOfPalindromeCheck pop=new PermutationOfPalindromeCheck();
        System.out.println("***PERMUTATION OF A PALINDROME***");
        pop.getAString();
        System.out.println(pop.isPermutationOfAPalindrome(pop.str));
    }
}

