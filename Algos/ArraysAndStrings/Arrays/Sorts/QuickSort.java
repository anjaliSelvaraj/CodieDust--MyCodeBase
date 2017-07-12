package Algos.ArraysAndStrings.Arrays.Sorts;

import Utilities.Services.Swap;

/**
 * Created by ANJALI on 01/30/17.
 */

//For smaller inputs, quick sort takes less time than merge sort, which is why it is called as QUICK sort.
 public class QuickSort {
   public static void qSort(int[] arr, int start,int end)
    {
        if(start<end) //base condition: till start and end cross each other
        {
            int mid=partition(arr,start,end);
            //mid takes the index of the element-
            // --> left of which is smaller than that element and right of which are greater that that element
            qSort(arr,start,mid-1);
            qSort(arr,mid+1,end);
        }
    }
   public static int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++)
        {
            if(arr[j]<=pivot) //the element lesser than pivot is pushed to front
            {
                i++;
                Swap.swap(arr,i,j);
            }
        }
        //now, elements before i are less than pivot and the elements after i  except the last element are greater than pivot
        i++;
        Swap.swap(arr,i,end); //moves the pivot element to the correct position
        return i;
    }
}
