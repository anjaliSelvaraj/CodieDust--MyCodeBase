package Algos.ArraysAndStrings.Strings;
/**
 * Created by ANJALI on 01/30/17.
 */
import java.util.Hashtable;
import java.util.Scanner;


/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. */
class StringPermutation {
    String str1,str2;
    void get2Strings()  {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 2 Strings");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("String 1:");
        str1 = s.nextLine();
        System.out.println("String 2:");
        str2 = s.nextLine();
    }


    // Here I am considering whitespace insignificant as in, "dog" and "d o g" are permutations
    boolean isSameLength(String str1, String str2)
    {
        // this method finds the length leaving the whitespaces out
        int c1=0;
        for(int i=0;i<str1.length();i++)
            if(str1.charAt(i)!=' ')
                c1++;

        int c2=0;
        for(int i=0;i<str2.length();i++)
            if(str2.charAt(i)!=' ')
                c2++;



        if(c1!=c2)
        {
            System.out.println("Strings of different length cannot be permutation.");
            return false;
        }
        return true;
    }
    boolean isPermutation(String str1,String str2)
    {

        if(!isSameLength(str1,str2))
            return false;

	  /*int sum1=0, sum2=0;
		for(char i:str1.toCharArray())
			sum1=sum1+i;
		for(char j:str2.toCharArray())
			sum2=sum2+j;
	}
	if(sum1==sum2)
		return true;
	return false;  proven wrong for strings AYX ,BYW etc*/

	 //Here I am joining the strings and keeping count of the characters
	 String joined=str1+str2;
        Hashtable<Character,Integer> counter=new Hashtable<Character,Integer>();
        for(char c:joined.toCharArray())
        {
            if(c!=' ') {
                if (counter.containsKey(c))
                    counter.put(c, counter.get(c) + 1);
                else
                    counter.put(c, 1);
            }
        }


        for(int i: counter.values())
            //if any of the character in the concatenated String has odd occurences, it means that these Strings cannot be permutation
            if(i%2!=0)
                return false;
        return true;
    }

    public static void main(String args[])
    {
        StringPermutation sp=new StringPermutation();
        System.out.println("***DETERMINE IF 2 STRINGS ARE PERMUTATIONS***");
        sp.get2Strings();
        System.out.println(sp.str1+" and "+sp.str2+" are permutations: "+sp.isPermutation(sp.str1, sp.str2));
    }
}

