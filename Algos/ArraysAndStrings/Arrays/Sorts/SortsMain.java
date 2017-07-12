package Algos.ArraysAndStrings.Arrays.Sorts;

/**
 * Created by ANJALI on 2/9/2017.
 */
import Utilities.Services.Sort;

import java.util.concurrent.TimeUnit;

class SortsMain {
     public static void main(String arg[])
     {
         int[] arr1 = {18, 30, 6, 12, 5, 22, 7};
         System.out.println("Input array");
         for (int num : arr1)
             System.out.print(num+"\t" );
         System.out.println();

         Sort.sort(arr1);
         System.out.println("Sorted array");
         for (int num : arr1)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int arr2[] = {18, 30, 6, 12, 5, 22, 7}; //reinitialising the array
         BubbleSort.bSort(arr2);
         System.out.println("Bubble-Sorted array");
         for (int num : arr2)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr3 = {18, 30, 6, 12, 5, 22, 7};
         InsertionSort.iSort(arr3);
         System.out.println("Insertion-Sorted array");
         for (int num : arr3)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr4 = {18, 30, 6, 12, 5, 22, 7};
         MergeSort.mSort(arr4,0,arr4.length-1);
         System.out.println("Merge-Sorted array");
         for (int num : arr4)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr5 = {18, 30, 6, 12, 5, 22, 7};
         QuickSort.qSort(arr5,0,arr5.length-1);
         System.out.println("Quick-Sorted array");
         for (int num : arr5)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr6 = {180,12,300, 6, 50, 212, -7,9,-7,1000,20,3000,2,40,21,34,66,90,12};
         System.out.println("Input array");
         for (int num : arr6)
             System.out.print(num+"\t" );
         System.out.println();

         Sort.sort(arr6);
         System.out.println("Sorted array");
         for (int num : arr6)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int arr7[] = {180,12,300, 6, 50, 212, -7,9,-7,1000,20,3000,2,40,21,34,66,90,12}; //reinitialising the array
         BubbleSort.bSort(arr7);
         System.out.println("Bubble-Sorted array");
         for (int num : arr7)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr8 = {180,12,300, 6, 50, 212, -7,9,-7,1000,20,3000,2,40,21,34,66,90,12};
         InsertionSort.iSort(arr8);
         System.out.println("Insertion-Sorted array");
         for (int num : arr8)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr9 = {180,12,300, 6, 50, 212, -7,9,-7,1000,20,3000,2,40,21,34,66,90,12};
         MergeSort.mSort(arr9,0,arr9.length-1);
         System.out.println("Merge-Sorted array");
         for (int num : arr9)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();

         int[] arr10 = {180,12,300, 6, 50, 212, -7,9,-7,1000,20,3000,2,40,21,34,66,90,12};
         QuickSort.qSort(arr10,0,arr10.length-1);
         System.out.println("Quick-Sorted array");
         for (int num : arr10)
             System.out.print(num+"\t" );
         System.out.print("time taken: " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
         System.out.println();
     }
}
