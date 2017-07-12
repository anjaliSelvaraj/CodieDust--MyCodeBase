package Algos.ArraysAndStrings.Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ANJALI on 3/1/2017.
 */
/*
 Given an M x N matrix in which each row and each column is sorted in ascending order, write a method to find an element.
 */
 class SortedMatrixSearch {
     private int sortedMatrix[][];
     private int row,col;
     private int  element;
     private void inputSortedMatrix()
     {
         Scanner s=new Scanner(System.in);
       System.out.println("Enter the number of rows in a matrix");
       row=s.nextInt();
       System.out.println("Enter the number of columns in a matrix");
         col=s.nextInt();
        sortedMatrix=new int[row][col];
       for(int i=0;i<row;i++) {
           for (int j = 0; j < col; j++) {
                   System.out.println("Enter element ["+i+"]["+j+"]");
                   sortedMatrix[i][j] = s.nextInt();
               if(i>0 && !(sortedMatrix[i-1][j]<sortedMatrix[i][j])) {
                   System.out.println("Matrix should be sorted");
                   inputSortedMatrix();
               }
           }
           Arrays.sort(sortedMatrix[i]); // sorts the elements of the row
       }
       System.out.println("enter the element to be searched:");
       element=s.nextInt();
     }
     private boolean findElementInSortedMatrix(int element)
     {
         int i=row-1;
     int j=0;
     boolean isFound=false;

     while(!(i<0 || j>col-1))
     {
         if(sortedMatrix[i][j]==element)
         {
             isFound=true;
             return isFound;
         }
         else if(sortedMatrix[i][j]<element)
              j++;
         else
             i--;
     }
         return isFound;
     }

    public static void main(String args[]) {
SortedMatrixSearch sms=new SortedMatrixSearch();
System.out.println("**** In Search of an Element in the Sorted Matrix **** ");
sms.inputSortedMatrix();
System.out.println(sms.findElementInSortedMatrix(sms.element));
}
}
