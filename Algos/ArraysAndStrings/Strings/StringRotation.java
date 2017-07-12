package Algos.ArraysAndStrings.Strings;

import java.util.Scanner;

/**
 * Created by ANJALI on 5/10/2017.
 */
public class StringRotation {
    String str1,str2;
    void get2Strings()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Strings:");
        System.out.println("String 1:");
        str1=s.next();
        System.out.println("String 2:");
        str2=s.next();
    }
    boolean isRotated(String s1, String s2){
        //Strings of variable length cannot be rotations of each other.
        if(s1.length()!=s2.length())
            return false;
        //if string s1 is the rotation of s2, then s1 should be a substring of s1s1
        return (s1 + s1).contains(s2);
    }

    public static void main(String args[]){
        StringRotation sr=new StringRotation();
        System.out.println("***STRING ROTATION***");
        sr.get2Strings();
        System.out.println(sr.str1+" and "+sr.str2+" are rotations of each other : "+sr.isRotated(sr.str1,sr.str2));
    }
}
