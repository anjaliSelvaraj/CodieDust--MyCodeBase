package Algos.ArraysAndStrings.Strings; /**
 * Created by ANJALI on 01/30/17.
 */

     /*There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away
 * EXAMPLE pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> false
 */
import java.io.IOException;
import java.util.Scanner;


    class OneEditAway {
        String str1,str2;
        boolean stringsEditComparison()
        {

            Scanner s=new Scanner(System.in);
            System.out.println("enter two strings ");
            str1=s.next();
            str2=s.next();

            //equality check
            if(str1.equalsIgnoreCase(str2))
                return true;
             //If the strings have same length, the possible edit can only be Replace
            if(str1.length()==str2.length())
                return isReplaced(str1,str2);

             if(Math.abs(str1.length()-str2.length())==1)
            return (str1.length()>str2.length()?isRemoved(str1,str2):isRemoved(str2,str1));

                return false;
        }

        boolean isReplaced(String str1,String str2)
        {
            int edit=0;
            int i,j;
            for( i=0,j=0;i<str1.length();i++,j++)
            {
                if(str1.charAt(i)!=str2.charAt(j))
                    edit++;
                if(edit>1)
                    return false;
            }
            return true;
        }

        boolean isRemoved(String str1,String str2) {
            int edit = 0;
            int i, j;
            for (i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++)
                if (str1.charAt(i) != str2.charAt(j)) {
                    edit++;
                    j--;
                    if (edit > 1)
                        return false;
                }
            return true;
        }
        public static void main(String args[])throws IOException
        {
            OneEditAway oe=new OneEditAway();
            System.out.println("***ONE EDIT AWAY***");
            System.out.println(oe.stringsEditComparison());
        }
}
