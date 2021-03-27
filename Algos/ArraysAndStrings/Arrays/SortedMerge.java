package Algos.ArraysAndStrings.Arrays;

import java.util.Scanner;

/**
 * Created by ANJALI on 2/26/2017.
 */

/* You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
Write a method to merge B into A in sorted order.
 */

class SortedMerge {
    private int[] arrA, arrB;
    private int sizeA, sizeB;

    /* USES SIMPLE MERGE AND SORT
    int[] sortedMerge(int[] arrA,int[] arrB)
    {
        int merged=arrA.length-1;
        for(int arrBElt:arrB)
        {
            arrA[merged]=arrBElt;
            merged--;
        }
        Algos.ArraysAndStrings.Arrays.Sorts.QuickSort.qSort(arrA,0,arrA.length-1);
       return arrA;
    }*/
    private void inputForSortedMerge() {
        Scanner s = new Scanner(System.in);
        System.out.println("****Sorted Merge***");
        System.out.println("Enter the number of elements in A");
        sizeA = s.nextInt();
        System.out.println("Enter the number of elements in B");
        sizeB = s.nextInt();
        arrA = new int[sizeA + sizeB];
        arrB = new int[sizeB];
        System.out.println("Enter the elements for A");
        for (int i = 0; i < sizeA; i++)
            arrA[i] = s.nextInt();
        System.out.println("Enter the elements for B");
        for (int i = 0; i < sizeB; i++)
            arrB[i] = s.nextInt();
    }

    private int[] sortedMerge() {
        //Our logic should involve simply comparing elements of A and B and inserting them in order, until we've exhausted all elements in A and in B.
        // The only issue with this is that if we insert an element into the front of A, then we'll have to shift the existing elements backwards to make room for it.
        // It's better to insert elements into the back of the array, where there's empty space. The
        int indexB = sizeB - 1;
        int indexA = sizeA - 1;

        for (int mergedIndex = (sizeA + sizeB) - 1; indexB >= 0; mergedIndex--)
        //Since arrA is already sorted, the only condition required is to insert arrB elements in order
        {
            if (indexA >= 0 && arrA[indexA] > arrB[indexB]) {
                arrA[mergedIndex] = arrA[indexA];
                indexA--;
            } else {
                arrA[mergedIndex] = arrB[indexB];
                indexB--;
            }
        }
        return arrA;
    }

    public static void main(String[] args) {
        SortedMerge sm = new SortedMerge();
        sm.inputForSortedMerge();
        for (int i : sm.sortedMerge())
            System.out.print(i + "\t");
    }
}
