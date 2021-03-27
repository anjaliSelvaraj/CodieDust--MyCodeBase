package Algos.ArraysAndStrings.Arrays.Sorts;

import Utilities.Services.Swap;

/**
 * Created by ANJALI on 01/30/17.
 */
public class BubbleSort {
    //Bubble Sort I Runtime: 0( n2) average and worst case. Memory: 0( 1) .
    // In bubble sort, we start at the beginning of the array and swap the first two elements if the first is greater than the second.
    // Then, we go to the next pair, and so on, continuously making sweeps of the array until it is sorted.
    // In doing so, the smaller items slowly"bubble" up to the beginning of the list.
    public static void bSort(int[] arr) {
        for (int cycle = 0; cycle < arr.length; cycle++)
        //cycle<arr.length/2 doesnt work for larger arrays having repeated values.
        //At the end of every cycle, one element will be in the right place.
        {
            for (int j = 1; j < arr.length - cycle; j++)
            //picks the element
            {
                if (arr[j - 1] > arr[j]) // compares every element with the previous element
                    // pushes bigger number to the end of the array
                    Swap.swap(arr, j - 1, j);
            }
        }
    }
}
