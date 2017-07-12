package Utilities.Services;

import Algos.LinkedList.LinkedList;

import java.util.Scanner;

/**
 * Created by ANJALI on 6/1/2017.
 */
public class Inputs {
    Scanner in=new Scanner(System.in);

    public int[] getIntArray(){
     int size;
     System.out.println("Enter the size of the integer array:");
     size=in.nextInt();

     System.out.println("Enter the elements");
     int[] arrayInt=new int[size];
     for(int i=0;i<size;i++)
         arrayInt[i]=in.nextInt();

     return arrayInt;
    }

    public String getAString()
    {
        System.out.println("Enter a string:");
        return in.next();
    }

   /* public java.util.LinkedList insertElementsToJavaList()
    {
        LinkedList<Integer> list =new java.util.LinkedList<>();
        System.out.println("Enter the elements for the list:");
        System.out.println("insert -0 to terminate");
        int temp;
        while(true){
            temp=in.nextInt();
            if(temp==-0)
                return list;
            else
                list.add(temp);
        }
    }*/

    public String getALine()
    {
        System.out.println("Enter a line");
        return in.nextLine();
    }
    public int getANumber()
    {
        System.out.println("Enter a number");
        return in.nextInt();
    }
    public int[][] get2DIntMatrix()
    {   int r,c;
        System.out.println("Enter number of rows:");
        r=in.nextInt();
        System.out.println("Enter the number of columns:");
        c=in.nextInt();
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++)
            for (int j=0;j<c;j++){
            matrix[i][j]=in.nextInt();
            }
            return matrix;
    }
    /*public int[][] get2DCharMatrix()
    {   int r,c;
        System.out.println("Enter number of rows:");
        r=in.nextInt();
        System.out.println("Enter the number of columns:");
        c=in.nextInt();
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++)
            for (int j=0;j<c;j++){
                matrix[i][j]=in.nextInt();
            }
        return matrix;
    }*/

    public int getBinary(){
        int binaryMask=0b0;
        System.out.println("Enter a binary number");
        return binaryMask+in.nextInt();
    }
    public LinkedList insertNumbersFromTail(){
        System.out.println("Enter the elements for list: (press -1 to end)");
        LinkedList list=new LinkedList();
        int s=in.nextInt();
        while(s!=-1){
            list.addFromTail(new LinkedList.Node(s));
            s=in.nextInt();
        }
        list.print();
        return list;
    }
}
